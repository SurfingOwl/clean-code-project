package com.esgi.cleancode.domain.ports.client;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.functional.model.Pack;

import io.vavr.control.Either;

public interface PackOpenerApi {
    
    Either<ApplicationError, Iterable<Hero>> open(Pack pack);

}
