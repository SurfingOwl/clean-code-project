package com.esgi.cleancode.domain.ports.server;

import com.esgi.cleancode.domain.ApplicationError;

import io.vavr.control.Either;
import io.vavr.control.Option;

public interface PersistenceSpi<T, ID> {

    Either<ApplicationError, T> save(T o);

    Either<ApplicationError, Iterable<T>> saveInBatch(Iterable<T> oList);

    Option<T> findById(ID id);

    Option<Iterable<T>> findAll();

    Either<ApplicationError, Void> deleteById(ID id);

    Either<ApplicationError, Void> deleteInBatch(Iterable<ID> ids);

}
