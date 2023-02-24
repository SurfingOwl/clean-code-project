package com.esgi.cleancode.server.mongo.repository;

import java.util.List;
import java.util.UUID;
import com.esgi.cleancode.server.mongo.entity.PlayerEntity;

import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository {

    default PlayerEntity getOne(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    default List<PlayerEntity> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    default <S extends PlayerEntity> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    default <S extends PlayerEntity> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    default void delete(PlayerEntity entity) {
        // TODO Auto-generated method stub
        
    }

    default void deleteInBatch(Iterable<PlayerEntity> entities) {
        // TODO Auto-generated method stub
    }
}
