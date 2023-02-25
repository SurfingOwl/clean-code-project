package com.esgi.cleancode.server.mongo.adapter;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.ports.server.HeroPersistenceSpi;
import com.esgi.cleancode.server.mongo.mapper.HeroEntityMapper;
import com.esgi.cleancode.server.mongo.repository.HeroRepository;

import io.vavr.collection.List;
import io.vavr.control.Either;
import io.vavr.control.Option;
import lombok.RequiredArgsConstructor;
import lombok.val;

import static io.vavr.API.Try;

@Service
@RequiredArgsConstructor
public class HeroMongoDbAdapter implements HeroPersistenceSpi {

    private final HeroRepository repository;  

    @Override
    @Transactional
    public Either<ApplicationError, Hero> save(Hero o) {
        val entity = HeroEntityMapper.fromDomain(o);
        return Try(() -> repository.save(entity))
            .toEither()
            .mapLeft(throwable -> new ApplicationError("Unable to save hero", null, o, throwable))
            .map(HeroEntityMapper::toDomain);
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
