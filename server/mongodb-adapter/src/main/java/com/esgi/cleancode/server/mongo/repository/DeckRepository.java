package com.esgi.cleancode.server.mongo.repository;

import java.util.UUID;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.esgi.cleancode.server.mongo.entity.DeckEntity;
public interface DeckRepository extends MongoRepository<DeckEntity, UUID> {

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
