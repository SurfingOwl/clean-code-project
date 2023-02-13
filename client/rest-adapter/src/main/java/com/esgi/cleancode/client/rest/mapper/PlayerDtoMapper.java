package com.esgi.cleancode.client.rest.mapper;

import com.esgi.cleancode.client.rest.dto.PlayerDto;
import com.esgi.cleancode.domain.functional.model.Player;

public interface PlayerDtoMapper {
    
    PlayerDto toDto(Player player);

    Player toDomain(PlayerDto dto);
}
