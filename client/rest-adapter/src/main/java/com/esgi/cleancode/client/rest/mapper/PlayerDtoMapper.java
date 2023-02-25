package com.esgi.cleancode.client.rest.mapper;

import com.esgi.cleancode.client.rest.dto.PlayerCreationDto;
import com.esgi.cleancode.domain.functional.model.Player;

public interface PlayerDtoMapper {
    
    static PlayerCreationDto toDto(Player player) { 
        return null; 
    }

    static Player toDomain(PlayerCreationDto dto) {
        return null; 
    }
}
