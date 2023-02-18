package com.esgi.cleancode.server.mongo.mapper;

import java.util.Set;

import com.esgi.cleancode.domain.functional.model.Player;
import com.esgi.cleancode.server.mongo.entity.PlayerEntity;

public interface PlayerEntityMapper {
    
    static Player toDomain(PlayerEntity entity) {
        return Player.builder()
            .id(entity.getId())
            .name(entity.getName())
            .balance(entity.getBalance())
            .deck(DeckEntityMapper.toDomain(entity.getDeck()))
            .build();
    }

    static PlayerEntity fromDomain(Player player) {
        return PlayerEntity.builder()
            .id(player.getId())
            .name(player.getName())
            .balance(player.getBalance())
            .deck(DeckEntityMapper.fromDomain(player.getDeck()))
            .build();
    }
}
