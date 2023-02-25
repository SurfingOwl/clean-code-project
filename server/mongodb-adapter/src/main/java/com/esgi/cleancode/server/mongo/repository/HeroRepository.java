package com.esgi.cleancode.server.mongo.repository;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.esgi.cleancode.server.mongo.entity.HeroEntity;

import io.vavr.collection.List;

@Repository
public interface HeroRepository  {

    default HeroEntity getOne(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    default List<HeroEntity> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    default <S extends HeroEntity> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    default <S extends HeroEntity> List<S> saveAll(List<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    default void delete(HeroEntity entity) {
        // TODO Auto-generated method stub
        
    }

    default void deleteInBatch(List<HeroEntity> entities) {
        // TODO Auto-generated method stub
        
    }
}
