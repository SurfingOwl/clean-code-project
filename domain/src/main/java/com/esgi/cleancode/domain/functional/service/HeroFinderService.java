package com.esgi.cleancode.domain.functional.service;

import java.util.UUID;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.ports.client.HeroFinderApi;
import com.esgi.cleancode.domain.ports.server.HeroPersistenceSpi;

import io.vavr.collection.List;
import io.vavr.control.Either;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class HeroFinderService implements HeroFinderApi {

    private final HeroPersistenceSpi spi;

    @Override
    public Either<ApplicationError, Hero> find(Hero hero) {
        return spi.findById(hero.getId())
            .onEmpty(() -> log.error("Could not find hero with id {}", hero.getId()))
            .toEither(() -> new ApplicationError("Hero finder", null, hero, null));
    }

    @Override
    public Either<ApplicationError, List<Hero>> search() {
        return spi.findAll()
            .onEmpty(() -> log.error("Could not find hero in database"))
            .toEither(() ->  new ApplicationError("Hero finder", null, null, null));
    }
    
}
