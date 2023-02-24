package com.esgi.cleancode.server.mongo.adapter;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Player;
import com.esgi.cleancode.domain.ports.server.PlayerPersistenceSpi;

import io.vavr.collection.List;
import io.vavr.control.Either;
import io.vavr.control.Option;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PlayerMongoDbAdapter implements PlayerPersistenceSpi {

    @Override
    public Either<ApplicationError, Player> save(Player o) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Option<Player> findById(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, List<Player>> saveInBatch(List<Player> oList) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Option<List<Player>> findAll() {
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
