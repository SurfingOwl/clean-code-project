package com.esgi.cleancode.server.mongo.mapper;

import java.util.Set;

import com.esgi.cleancode.domain.functional.model.Battle;
import com.esgi.cleancode.server.mongo.entity.BattleEntity;

public interface BattleEntityMapper {
    
    static Battle toDomain(BattleEntity entity) {
        return Battle.builder()
            .id(entity.getId())
            .fighters(Set.of(PlayerEntityMapper.toDomain(entity.getFigthers().iterator().next())))
            .build();
    }

    static BattleEntity fromDomain(Battle battle) {
        return BattleEntity.builder()
        .id(battle.getId())
        .figthers(Set.of(PlayerEntityMapper.fromDomain(battle.getFighters().iterator().next())))
        .build();
    }
}
