package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.enums.RarityEnum;
import com.esgi.cleancode.domain.functional.factory.HeroFactory;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.functional.model.Pack;
import com.esgi.cleancode.domain.functional.model.Player;
import com.esgi.cleancode.domain.functional.service.validation.PlayerBalanceValidator;
import com.esgi.cleancode.domain.ports.client.PackOpenerApi;

import io.vavr.collection.List;
import io.vavr.control.Either;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
@AllArgsConstructor
public class PackOpenerService implements PackOpenerApi {

    private final HeroFinderService heroFinderService;
    private final DeckAppenderService deckAppenderService;
    private final PlayerCreatorService playerCreatorService;

    @Override
    public Either<ApplicationError, Player> open(Player player, Pack pack) {
        return verifyPlayerBalance(player, pack)
            .peek(responsePlayer -> calculateNewPlayerBalance(responsePlayer, pack))
            .peek(responsePlayer -> deckAppenderService.add(responsePlayer.getDeck(), getHeroesFromPack(pack)));
    }

    private Either<ApplicationError, Player> verifyPlayerBalance(Player player, Pack pack) {
        return PlayerBalanceValidator.validate(player, pack)
            .toEither()
            .peekLeft(error -> log.error("Balance {} is too low to purchase pack {}", player.getBalance(), pack.getPrice()));
    }

    private List<Hero> getHeroesFromPack(Pack pack) {
        List<Hero> heroes = List.of();
        var allHeroes = heroFinderService.search().peekLeft(error -> log.error("No heroes found: {}", error)).get();
        
        for (int i = 0; i < pack.getCardNumber(); i++) {
            
            var hero = selectRandomHeroFromList(allHeroes);
            heroes.push(
                HeroFactory.fromHero(
                    hero.getId(),
                    hero.getName(),
                    hero.getHealthPoint(),
                    hero.getPower(),
                    hero.getArmor(),
                    hero.getExperiencePoints(),
                    hero.getLevel(),
                    getDropChances(pack),
                    hero.getSpeciality())        
            );
        }
        
        return heroes;
    }
    
    private RarityEnum getDropChances(Pack pack) {
        double chance = Math.random();
        switch(pack.getPackRarity()) {
            case DIAMOND:
                if (0 < chance && chance <= 0.15)
                    return RarityEnum.LEGENDARY;
                else if (0.15 < chance && chance <= 0.35)
                    return RarityEnum.RARE;
                else
                    return RarityEnum.COMMON;
            case SILVER:
                if (0 < chance && chance <= 0.05)
                    return RarityEnum.LEGENDARY;
                else if (0.15 < chance && chance <= 0.20)
                    return RarityEnum.RARE;
                else
                    return RarityEnum.COMMON;
            default:
                return null; // TODO NOT CLEAN
        }
    }

    private Hero selectRandomHeroFromList(List<Hero> heroes) {
        Random randomizer  = new Random();
        return heroes.get(randomizer.nextInt());
    }

    private Either<ApplicationError, Player> calculateNewPlayerBalance(Player player, Pack pack) {
        return playerCreatorService.update(player.withBalance(player.getBalance() - pack.getPrice()));
    }
}
