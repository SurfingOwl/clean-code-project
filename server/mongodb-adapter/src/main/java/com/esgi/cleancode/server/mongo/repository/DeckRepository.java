package com.esgi.cleancode.server.mongo.repository;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.esgi.cleancode.server.mongo.entity.DeckEntity;

import io.vavr.collection.List;

@Repository
public interface DeckRepository {

    default DeckEntity getOne(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    default List<DeckEntity> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    default <S extends DeckEntity> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    default <S extends DeckEntity> List<S> saveAll(List<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    default void delete(DeckEntity entity) {
        // TODO Auto-generated method stub
        
    }

    default void deleteInBatch(List<DeckEntity> entities) {
        // TODO Auto-generated method stub
        
    }
}
