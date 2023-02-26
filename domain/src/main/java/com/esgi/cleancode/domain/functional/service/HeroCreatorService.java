package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.enums.RarityEnum;
import com.esgi.cleancode.domain.functional.enums.SpecialityEnum;
import com.esgi.cleancode.domain.functional.factory.HeroFactory;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.ports.client.HeroCreatorApi;
import com.esgi.cleancode.domain.ports.server.HeroPersistenceSpi;

import io.vavr.collection.List;
import io.vavr.control.Either;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HeroCreatorService implements HeroCreatorApi {

    private final HeroPersistenceSpi spi;

    @Override
    public Either<ApplicationError, Hero> create(String name, RarityEnum rarity, SpecialityEnum speciality) {
        return spi.save(HeroFactory.createHero(name, rarity, speciality));
    }

    @Override
    public Either<ApplicationError, List<Hero>> createAll(String name, SpecialityEnum speciality) {
        return spi.saveInBatch(List.of(
            HeroFactory.createHero(name, RarityEnum.COMMON, speciality),
            HeroFactory.createHero(name, RarityEnum.RARE, speciality),
            HeroFactory.createHero(name, RarityEnum.LEGENDARY, speciality)
        ));
    }
}
