package com.esgi.cleancode.client.rest.mapper;

import com.esgi.cleancode.client.rest.dto.PlayerCreationDto;
import com.esgi.cleancode.domain.functional.model.Player;

public interface PlayerDtoMapper {
    
    PlayerCreationDto toDto(Player player);

    Player toDomain(PlayerCreationDto dto);
}
