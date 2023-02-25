package com.esgi.cleancode.domain.ports.client;

import java.util.UUID;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Hero;

import io.vavr.collection.List;
import io.vavr.control.Either;

public interface HeroFinderApi {
    
    Either<ApplicationError, Hero> find(UUID id);

    Either<ApplicationError, List<Hero>> search();

}
