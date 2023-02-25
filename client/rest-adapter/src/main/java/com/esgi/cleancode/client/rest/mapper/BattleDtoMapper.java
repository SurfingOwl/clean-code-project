package com.esgi.cleancode.client.rest.mapper;

import com.esgi.cleancode.client.rest.dto.BattleCreationDto;
import com.esgi.cleancode.client.rest.dto.BattleDto;
import com.esgi.cleancode.domain.functional.model.Battle;

import io.vavr.collection.HashMap;
import io.vavr.collection.List;

public interface BattleDtoMapper {
    
    static Battle toDomain(BattleCreationDto dto) {
        return Battle.builder()
            .fighters(HashMap.of(dto.attacker(), dto.attacked()))
            .build();
    }
    
    static BattleDto toDto(Battle battle) {
        return new BattleDto(
            battle.getId(),
            battle.getFighters().bimap(
                key -> HeroDtoMapper.toDto(key),
                value -> HeroDtoMapper.toDto(value)),
            battle.getStatus());
    }
    
    static List<BattleDto> toDto(List<Battle> battles) {
        return List.ofAll(battles.map(battle -> toDto(battle)));
    }
}
