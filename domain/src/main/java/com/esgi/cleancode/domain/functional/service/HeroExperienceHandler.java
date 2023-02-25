package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.errors.HeroFactoryException;
import com.esgi.cleancode.domain.functional.factory.HeroFactory;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.ports.server.HeroPersistenceSpi;

import io.vavr.control.Either;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HeroExperienceHandler { // Serait sûrement plus propre avec des methods "with" dans le heroFactory
    
    private final HeroPersistenceSpi spi; 

    // withExpUp
    Either<ApplicationError, Hero> experienceUp(Hero hero) throws HeroFactoryException {
        return spi.save(
            HeroFactory.fromHero(
            hero.getId(),
            hero.getName(),
            hero.getHealthPoint(),
            hero.getPower(),
            hero.getArmor(),
            hero.getExperiencePoints() + 1,
            hero.getLevel(),
            hero.getRarity(),
            hero.getSpeciality())
        );
    }

    // withLvlUp
    Either<ApplicationError, Hero> levelUp(Hero hero) throws HeroFactoryException {
        return spi.save(
            HeroFactory.fromHero(
            hero.getId(),
            hero.getName(),
            HeroFactory.applyRarityBonus(hero.getHealthPoint(), hero.getRarity()),
            HeroFactory.applyRarityBonus(hero.getPower(), hero.getRarity()),
            HeroFactory.applyRarityBonus(hero.getArmor(), hero.getRarity()),
            0,
            hero.getLevel() + 1,
            hero.getRarity(),
            hero.getSpeciality())
        );
    }
}
