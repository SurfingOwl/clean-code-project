package com.esgi.cleancode.server.mongo.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.esgi.cleancode.server.mongo.entity.DeckEntity;

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

    default <S extends DeckEntity> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    default void delete(DeckEntity entity) {
        // TODO Auto-generated method stub
        
    }

    default void deleteInBatch(Iterable<DeckEntity> entities) {
        // TODO Auto-generated method stub
        
    }
}
