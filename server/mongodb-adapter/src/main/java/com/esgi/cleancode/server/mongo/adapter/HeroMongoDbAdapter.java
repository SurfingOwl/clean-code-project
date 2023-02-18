package com.esgi.cleancode.server.mongo.adapter;

import java.util.UUID;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.ports.server.HeroPersistenceSpi;

import io.vavr.control.Either;
import io.vavr.control.Option;

public class HeroMongoDbAdapter implements HeroPersistenceSpi {

    @Override
    public Either<ApplicationError, Hero> save(Hero o) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, Iterable<Hero>> saveInBatch(Iterable<Hero> oList) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Option<Hero> findById(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Option<Iterable<Hero>> findAll() {
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
