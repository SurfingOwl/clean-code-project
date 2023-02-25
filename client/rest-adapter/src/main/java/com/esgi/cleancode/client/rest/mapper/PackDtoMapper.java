package com.esgi.cleancode.client.rest.mapper;

import com.esgi.cleancode.client.rest.dto.PackOpenerDto;
import com.esgi.cleancode.client.rest.dto.PlayerDto;
import com.esgi.cleancode.domain.functional.factory.PackFactory;
import com.esgi.cleancode.domain.functional.model.Pack;
import com.esgi.cleancode.domain.functional.model.Player;

public interface PackDtoMapper {
    
    static Pack toDomain(PackOpenerDto packOpenerDto) {
        return PackFactory.buildPack(packOpenerDto.packRarity());
    }

    static PlayerDto toDto(Player player) {
        return new PlayerDto(
            player.getId(), 
            player.getName(), 
            player.getBalance(), 
            DeckDtoMapper.toDto(player.getDeck()));
    }
}
