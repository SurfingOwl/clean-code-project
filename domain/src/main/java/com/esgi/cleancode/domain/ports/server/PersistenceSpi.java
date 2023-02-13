package com.esgi.cleancode.domain.ports.server;

import com.esgi.cleancode.domain.ApplicationError;

import io.vavr.control.Either;
import io.vavr.control.Option;

public interface PersistenceSpi<T, ID> {
    Either<ApplicationError, T> save(T o);

    Option<T> findById(ID id);  
}
