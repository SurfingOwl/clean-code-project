package com.esgi.cleancode.domain.ports.client;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Hero;

import io.vavr.control.Either;

public interface HeroCreatorApi {
    
    Either<ApplicationError, Hero> create(Hero hero);

}
