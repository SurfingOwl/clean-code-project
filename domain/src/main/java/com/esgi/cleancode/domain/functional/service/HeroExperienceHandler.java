package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.ports.server.HeroPersistenceSpi;

import io.vavr.control.Either;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HeroExperienceHandler {
    
    private final HeroPersistenceSpi spi; 

    Either<ApplicationError, Hero> experienceUp(Hero hero) {
        // TODO
        return null;
    }

    Either<ApplicationError, Hero> levelUp(Hero hero) {
        // TODO
        return null;
    }
}
