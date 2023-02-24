package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.enums.PackEnum;
import com.esgi.cleancode.domain.functional.factory.PackFactory;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.functional.model.Pack;
import com.esgi.cleancode.domain.functional.model.Player;
import com.esgi.cleancode.domain.functional.service.validation.PlayerBalanceValidator;
import com.esgi.cleancode.domain.ports.client.PackOpenerApi;
import com.esgi.cleancode.domain.ports.server.PlayerPersistenceSpi;

import io.vavr.collection.List;
import io.vavr.control.Either;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import static io.vavr.API.Left;

@Slf4j
@AllArgsConstructor
public class PackOpenerService implements PackOpenerApi {

    private final PlayerPersistenceSpi spi;
    private final DeckAppenderService deckAppenderService;

    @Override
    public Either<ApplicationError, List<Hero>> open(Player player, Pack pack) {
        return null;
    }

    private Either<ApplicationError, Player> verifyPlayerBalance(Player player, Pack pack) {
        return PlayerBalanceValidator.validate(player, pack)
            .toEither()
            .peekLeft(error -> log.error("Balance {} is too low to purchase pack {}", player.getBalance(), pack.getPrice()));
    }

    private List<Hero> getHeroesFromPack(PackEnum rarity) {
        Pack pack = PackFactory.buildPack(rarity);
        var heroes = List.empty();
        // Use Math.random() to get hero depending on drop chance
        for (int i = 0; i < pack.getCardNumber(); i++) {
            heroes.push(pack.getDropChances().get(rarity));
        }
        return null;
    }
    
}
