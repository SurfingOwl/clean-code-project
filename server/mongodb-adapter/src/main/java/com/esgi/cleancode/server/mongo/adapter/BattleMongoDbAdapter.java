package com.esgi.cleancode.server.mongo.adapter;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Battle;
import com.esgi.cleancode.domain.ports.server.BattlePersistenceSpi;
import com.esgi.cleancode.server.mongo.mapper.BattleEntityMapper;
import com.esgi.cleancode.server.mongo.repository.BattleRepository;

import io.vavr.collection.List;
import io.vavr.control.Either;
import io.vavr.control.Option;
import lombok.RequiredArgsConstructor;
import lombok.val;

import static io.vavr.API.Try;

@Service
@RequiredArgsConstructor
public class BattleMongoDbAdapter implements BattlePersistenceSpi {

    private final BattleRepository repository;

    @Override
    public Option<Battle> findById(UUID id) {
        return Try(() -> repository.findById(id))
        .map(entity -> BattleEntityMapper.toDomain(entity.get()))
        .toOption();
    }

    @Override
    public Option<List<Battle>> findAll() {
        return Try(() -> repository.findAll())
            .map(list -> List.ofAll(list))
            .map(BattleEntityMapper::toDomain)
            .toOption();
    }

    @Override
    public Either<ApplicationError, Battle> save(Battle o) {
        val entity = BattleEntityMapper.fromDomain(o);
        return Try(() -> repository.save(entity))
            .toEither()
            .mapLeft(throwable -> new ApplicationError("Unable to save hero", null, o, throwable))
            .map(BattleEntityMapper::toDomain);
    }

    @Override
    public Either<ApplicationError, List<Battle>> saveInBatch(List<Battle> oList) {
        // TODO Auto-generated method stub
        return null;
    }

}
