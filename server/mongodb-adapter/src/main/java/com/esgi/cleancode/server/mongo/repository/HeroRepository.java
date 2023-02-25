package com.esgi.cleancode.server.mongo.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.esgi.cleancode.server.mongo.entity.HeroEntity;

public interface HeroRepository extends MongoRepository<HeroEntity, UUID> {

    @Query("")
    default HeroEntity getOne(UUID id) {
        return null;
    }

    @Query("")
    default List<HeroEntity> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Query("")
    default <S extends HeroEntity> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Query("")
    default <S extends HeroEntity> List<S> saveAll(List<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Query("")
    default void delete(HeroEntity entity) {
        // TODO Auto-generated method stub
    }

    @Query("")
    default void deleteInBatch(List<HeroEntity> entities) {
        // TODO Auto-generated method stub    
    }
}
