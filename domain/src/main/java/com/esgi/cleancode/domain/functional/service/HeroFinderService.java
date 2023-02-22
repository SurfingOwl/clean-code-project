package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.ports.client.HeroFinderApi;
import com.esgi.cleancode.domain.ports.server.HeroPersistenceSpi;

import io.vavr.collection.List;
import io.vavr.control.Either;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HeroFinderService implements HeroFinderApi {

    private final HeroPersistenceSpi spi;

    @Override
    public Either<ApplicationError, Hero> inspect(Hero hero) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, List<Hero>> search() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
