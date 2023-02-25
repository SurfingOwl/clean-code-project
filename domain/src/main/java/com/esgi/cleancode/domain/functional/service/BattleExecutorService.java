package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.enums.BattleStatusEnum;
import com.esgi.cleancode.domain.functional.factory.HeroFactory;
import com.esgi.cleancode.domain.functional.model.Battle;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.ports.client.BattleExecutorApi;
import com.esgi.cleancode.domain.ports.server.BattlePersistenceSpi;

import io.vavr.collection.HashMap;
import io.vavr.control.Either;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BattleExecutorService implements BattleExecutorApi {

    private final BattlePersistenceSpi spi;

    @Override
    public Either<ApplicationError, Battle> engage(Hero attacker, Hero attacked) {
        return spi.save(Battle.builder()
            .fighters(HashMap.of(attacker, attacked))
            .build()
        );
    }

    // A mon avis pb ici concernant l'attaquant et l'attaqué
    // 
    @Override
    public Either<ApplicationError, Battle> attack(Battle battle, Hero attacker) {

        Hero attacked = battle.getFighters().get()._2().equals(attacker) ? battle.getFighters().get().swap()._1() : battle.getFighters().get()._2();

        return attacked.getHealthPoint() - getDamages(attacker, attacked) > 0 || !battle.getStatus().equals(BattleStatusEnum.DONE)
        ? spi.save(Battle.builder()
            .id(battle.getId())
            .fighters(HashMap.of(
                attacker, 
                HeroFactory.fromHero( // Peut créer une method "withHp" en vrai
                    attacked.getId(),
                    attacked.getName(),
                    attacked.getHealthPoint() - getDamages(attacker, attacked),
                    attacked.getPower(),
                    attacked.getArmor(),
                    attacked.getExperiencePoints(),
                    attacked.getLevel(),
                    attacked.getRarity(),
                    attacked.getSpeciality()
                )
            ))
            .build()
        )
        : spi.save(battle.withStatus(BattleStatusEnum.DONE));
    }
    
    private Double getDamages(Hero attacker, Hero attacked) {
        return attacker.getPower() - attacked.getArmor();
    }
}
