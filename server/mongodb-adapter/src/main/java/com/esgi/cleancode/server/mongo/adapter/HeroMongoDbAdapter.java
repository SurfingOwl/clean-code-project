package com.esgi.cleancode.server.mongo.adapter;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.ports.server.HeroPersistenceSpi;

import io.vavr.collection.List;
import io.vavr.control.Either;
import io.vavr.control.Option;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HeroMongoDbAdapter implements HeroPersistenceSpi {

    @Override
    public Either<ApplicationError, Hero> save(Hero o) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, List<Hero>> saveInBatch(List<Hero> oList) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Option<Hero> findById(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Option<List<Hero>> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, Void> deleteById(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, Void> deleteInBatch(List<UUID> ids) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
