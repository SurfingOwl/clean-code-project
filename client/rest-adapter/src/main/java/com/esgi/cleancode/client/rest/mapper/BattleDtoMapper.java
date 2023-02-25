package com.esgi.cleancode.client.rest.mapper;

import com.esgi.cleancode.client.rest.dto.BattleCreationDto;
import com.esgi.cleancode.domain.functional.model.Battle;

public interface BattleDtoMapper {
    
    Battle toDomain(BattleCreationDto dto);

    BattleCreationDto toDto(Battle battle);
}
