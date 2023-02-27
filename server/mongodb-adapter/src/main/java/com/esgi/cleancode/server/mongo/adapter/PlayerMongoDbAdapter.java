package com.esgi.cleancode.server.mongo.adapter;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Player;
import com.esgi.cleancode.domain.ports.server.PlayerPersistenceSpi;
import com.esgi.cleancode.server.mongo.mapper.PlayerEntityMapper;
import com.esgi.cleancode.server.mongo.repository.PlayerRepository;

import io.vavr.collection.List;
import io.vavr.control.Either;
import io.vavr.control.Option;
import lombok.RequiredArgsConstructor;
import lombok.val;

import static io.vavr.API.Try;

@Service
@RequiredArgsConstructor
public class PlayerMongoDbAdapter implements PlayerPersistenceSpi {

    private final PlayerRepository repository;

    @Override
    public Option<Player> findById(UUID id) {
        return Try(() -> repository.findById(id))
            .map(entity -> PlayerEntityMapper.toDomain(entity.get()))
            .toOption();
    }

    @Override
    public Option<List<Player>> findAll() {
        return Try(() -> repository.findAll())
            .map(list -> List.ofAll(list))
            .map(PlayerEntityMapper::toDomain)
            .toOption();
    }

    @Override
    public Either<ApplicationError, Player> save(Player o) {
        val entity = PlayerEntityMapper.fromDomain(o);
        return Try(() -> repository.save(entity))
            .toEither()
            .mapLeft(throwable -> new ApplicationError("Unable to save player", null, o, throwable))
            .map(PlayerEntityMapper::toDomain);
    }

    @Override
    public Either<ApplicationError, List<Player>> saveInBatch(List<Player> oList) {
        // TODO Auto-generated method stub
        return null;
    }
}
