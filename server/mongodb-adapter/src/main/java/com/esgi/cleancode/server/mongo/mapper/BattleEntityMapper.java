package com.esgi.cleancode.server.mongo.mapper;

import com.esgi.cleancode.domain.functional.model.Battle;
import com.esgi.cleancode.server.mongo.entity.BattleEntity;

import io.vavr.collection.HashMap;
import io.vavr.collection.List;
public interface BattleEntityMapper {
    
    static Battle toDomain(BattleEntity entity) {
        return Battle.builder()
            .id(entity.getId())
            .fighters(HashMap.of(HashMap.ofAll(entity.getFighters()).get()).bimap(HeroEntityMapper::toDomain, HeroEntityMapper::toDomain))
            .status(entity.getStatus())
            .build();
    }

    static List<Battle> toDomain(List<BattleEntity> entities) {
        return List.ofAll(entities.map(entity -> toDomain(entity)));
    }

    static BattleEntity fromDomain(Battle battle) {
        return BattleEntity.builder()
        .id(battle.getId())
        .fighters(HashMap.of(battle.getFighters().get()).bimap(HeroEntityMapper::fromDomain, HeroEntityMapper::fromDomain).toJavaMap())
        .status(battle.getStatus())
        .build();
    }

    static List<BattleEntity> fromDomain(List<Battle> battles) {
        return List.ofAll(battles.map(battle -> fromDomain(battle)));
    }
}
