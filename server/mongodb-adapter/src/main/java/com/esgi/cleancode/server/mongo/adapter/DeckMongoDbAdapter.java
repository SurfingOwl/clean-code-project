package com.esgi.cleancode.server.mongo.adapter;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.esgi.cleancode.domain.functional.model.Deck;
import com.esgi.cleancode.domain.ports.server.DeckPersistenceSpi;
import com.esgi.cleancode.server.mongo.mapper.DeckEntityMapper;
import com.esgi.cleancode.server.mongo.repository.DeckRepository;
import com.esgi.cleancode.domain.ApplicationError;

import io.vavr.collection.List;
import io.vavr.control.Either;
import io.vavr.control.Option;
import lombok.RequiredArgsConstructor;
import lombok.val;

import static io.vavr.API.Try;

@Service
@RequiredArgsConstructor
public class DeckMongoDbAdapter implements DeckPersistenceSpi {

    private final DeckRepository repository;

    @Override
    public Option<Deck> findById(UUID id) {
        return Try(() -> repository.findById(id))
        .map(entity -> DeckEntityMapper.toDomain(entity.get()))
        .toOption();
    }

    @Override
    public Option<List<Deck>> findAll() {
        return Try(() -> repository.findAll())
            .map(list -> List.ofAll(list))
            .map(DeckEntityMapper::toDomain)
            .toOption();
    }

    @Override
    public Either<ApplicationError, Deck> save(Deck o) {
        val entity = DeckEntityMapper.fromDomain(o);
        return Try(() -> repository.save(entity))
            .toEither()
            .mapLeft(throwable -> new ApplicationError("Unable to save hero", null, o, throwable))
            .map(DeckEntityMapper::toDomain);
    }

    @Override
    public Either<ApplicationError, List<Deck>> saveInBatch(List<Deck> oList) {
        // TODO Auto-generated method stub
        return null;
    }
    
}