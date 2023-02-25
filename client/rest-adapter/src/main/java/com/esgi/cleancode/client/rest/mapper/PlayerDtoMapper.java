package com.esgi.cleancode.client.rest.mapper;

import com.esgi.cleancode.client.rest.dto.PlayerCreationDto;
import com.esgi.cleancode.client.rest.dto.PlayerDto;
import com.esgi.cleancode.domain.functional.model.Player;

import io.vavr.collection.List;

public interface PlayerDtoMapper {
    
    static PlayerDto toDto(Player player) { 
        return new PlayerDto(
            player.getId(),
            player.getName(),
            player.getBalance(),
            DeckDtoMapper.toDto(player.getDeck())); 
    }

    static List<PlayerDto> toDto(List<Player> players) {
        return List.ofAll(players.map(player -> toDto(player)));
    }

    static Player toDomain(PlayerCreationDto dto) {
        return Player.builder()
            .name(dto.name())
            .build(); 
    }
}
