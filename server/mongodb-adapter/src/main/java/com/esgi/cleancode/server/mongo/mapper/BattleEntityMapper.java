package com.esgi.cleancode.server.mongo.mapper;

import com.esgi.cleancode.domain.functional.model.Battle;
import com.esgi.cleancode.server.mongo.entity.BattleEntity;

import io.vavr.collection.HashMap;
public interface BattleEntityMapper {
    
    static Battle toDomain(BattleEntity entity) {
        return Battle.builder()
            .id(entity.getId())
            .fighters(HashMap.of(entity.getFigthers().get()).bimap(HeroEntityMapper::toDomain, HeroEntityMapper::toDomain))
            .build();
    }

    static BattleEntity fromDomain(Battle battle) {
        return BattleEntity.builder()
        .id(battle.getId())
        .figthers(null)
        .build();
    }
}
