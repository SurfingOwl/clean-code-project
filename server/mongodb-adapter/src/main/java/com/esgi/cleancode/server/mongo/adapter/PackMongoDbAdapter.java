package com.esgi.cleancode.server.mongo.adapter;

import java.util.UUID;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Pack;
import com.esgi.cleancode.domain.ports.server.PackPersistenceSpi;

import io.vavr.control.Either;
import io.vavr.control.Option;

public class PackMongoDbAdapter implements PackPersistenceSpi {

    @Override
    public Either<ApplicationError, Pack> save(Pack o) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, Iterable<Pack>> saveInBatch(Iterable<Pack> oList) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Option<Pack> findById(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Option<Iterable<Pack>> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, Void> deleteById(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, Void> deleteInBatch(Iterable<UUID> ids) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
