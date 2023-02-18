package com.esgi.cleancode.server.mongo.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esgi.cleancode.server.mongo.entity.PackEntity;

@Repository
public interface PackRepository extends JpaRepository<PackEntity, UUID> {
    
    @Override
    default PackEntity getOne(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default List<PackEntity> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends PackEntity> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends PackEntity> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default void delete(PackEntity entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    default void deleteInBatch(Iterable<PackEntity> entities) {
        // TODO Auto-generated method stub
        
    }
}
