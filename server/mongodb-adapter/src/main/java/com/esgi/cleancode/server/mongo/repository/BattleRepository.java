package com.esgi.cleancode.server.mongo.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esgi.cleancode.server.mongo.entity.BattleEntity;

@Repository
public interface BattleRepository extends JpaRepository<BattleEntity, UUID> {


    @Override
    default BattleEntity getOne(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default List<BattleEntity> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends BattleEntity> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default <S extends BattleEntity> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default void delete(BattleEntity entity) {
        // TODO Auto-generated method stub
    }
    
    @Override
    default void deleteInBatch(Iterable<BattleEntity> entities) {
        // TODO Auto-generated method stub 
    }
}
