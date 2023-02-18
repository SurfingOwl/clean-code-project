package com.esgi.cleancode.server.mongo.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esgi.cleancode.server.mongo.entity.DeckEntity;

@Repository
public interface DeckRepository extends JpaRepository<DeckEntity, UUID> {

    @Override
    default DeckEntity getOne(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default List<DeckEntity> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends DeckEntity> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends DeckEntity> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default void delete(DeckEntity entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default void deleteInBatch(Iterable<DeckEntity> entities) {
        // TODO Auto-generated method stub
        
    }
}
