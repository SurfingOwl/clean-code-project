package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.ports.client.HeroCreatorApi;
import com.esgi.cleancode.domain.ports.server.HeroPersistenceSpi;

import io.vavr.control.Either;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HeroCreatorService implements HeroCreatorApi {

    private final HeroPersistenceSpi spi;

    @Override
    public Either<ApplicationError, Hero> create(Hero hero) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
