package com.esgi.cleancode.client.rest.mapper;

import com.esgi.cleancode.client.rest.dto.BattleCreationDto;
import com.esgi.cleancode.domain.functional.model.Battle;

import io.vavr.collection.List;

public interface BattleDtoMapper {
    
    static Battle toDomain(BattleCreationDto dto) {
        return null;
    }
    
    static BattleCreationDto toDto(Battle battle) {
        return null;
    }
    
    static BattleCreationDto toDto(List<Battle> battle) {
        return null;
    }
}
