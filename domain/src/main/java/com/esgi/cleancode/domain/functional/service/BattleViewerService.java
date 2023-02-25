package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Battle;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.functional.service.validation.BattleSearchValidator;
import com.esgi.cleancode.domain.ports.client.BattleViewerApi;
import com.esgi.cleancode.domain.ports.server.BattlePersistenceSpi;
import com.esgi.cleancode.domain.ports.server.HeroPersistenceSpi;

import io.vavr.collection.List;
import io.vavr.control.Either;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import static io.vavr.API.Left;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
public class BattleViewerService implements BattleViewerApi {

    private final BattlePersistenceSpi battleSpi;
    private final HeroPersistenceSpi heroSpi;

    @Override
    public Either<ApplicationError, Battle> findById(UUID id) {
        return battleSpi.findById(id)
            .onEmpty(() -> log.error("Unable to find battle with id{}", id))
            .toEither(new ApplicationError("No battle", null, id, null));
    }

    @Override
    public Either<ApplicationError, List<Battle>> findByHeroId(UUID id) {
        return battleSpi.findAll()
            .onEmpty(() -> log.error("Unable to find battles associated with this hero: {}", id))
            .fold(() -> Left(new ApplicationError("No battles", null, id, null)),
            battles -> getBattleListFromHero(battles, heroSpi.findById(id).get()));
    }

    private Either<ApplicationError, List<Battle>> getBattleListFromHero(List<Battle> battles, Hero hero) {
        List<Battle> relevantBattle = battles.filter(battle -> battle.getFighters().get()._1().equals(hero));
        return BattleSearchValidator.validate(relevantBattle)
            .toEither()
            .peekLeft(error -> log.error("Unable to validate search with Hero {}", hero));
    }
    
}
