package com.esgi.cleancode.domain.ports.server;

import com.esgi.cleancode.domain.ApplicationError;

import io.vavr.collection.List;
import io.vavr.control.Either;
import io.vavr.control.Option;

public interface PersistenceSpi<T, ID> {

    Either<ApplicationError, T> save(T o);

    Either<ApplicationError, List<T>> saveInBatch(List<T> oList);

    Option<T> findById(ID id);

    Option<List<T>> findAll();
}
