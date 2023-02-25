package com.esgi.cleancode.server.mongo.repository;

import java.util.UUID;
import com.esgi.cleancode.server.mongo.entity.PlayerEntity;

import io.vavr.collection.List;

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

    default <S extends PlayerEntity> List<S> saveAll(List<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    default void delete(PlayerEntity entity) {
        // TODO Auto-generated method stub
        
    }

    default void deleteInBatch(List<PlayerEntity> entities) {
        // TODO Auto-generated method stub
    }
}
