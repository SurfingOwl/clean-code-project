package com.esgi.cleancode.domain.ports.client;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Hero;

import io.vavr.collection.List;
import io.vavr.control.Either;

public interface HeroFinderApi {
    
    Either<ApplicationError, Hero> inspect(Hero hero);

    Either<ApplicationError, List<Hero>> search();

}
