package com.esgi.cleancode.server.mongo.mapper;

import com.esgi.cleancode.domain.functional.model.Player;
import com.esgi.cleancode.server.mongo.entity.PlayerEntity;

import io.vavr.collection.List;

public interface PlayerEntityMapper {
    
    static Player toDomain(PlayerEntity entity) {
        return Player.builder()
            .id(entity.getId())
            .name(entity.getName())
            .balance(entity.getBalance())
            .deck(DeckEntityMapper.toDomain(entity.getDeck()))
            .build();
    }

    static List<Player> toDomain(List<PlayerEntity> entities) {
        return List.ofAll(entities.map(entity -> toDomain(entity)));
    }

    static PlayerEntity fromDomain(Player player) {
        return PlayerEntity.builder()
            .id(player.getId())
            .name(player.getName())
            .balance(player.getBalance())
            .deck(DeckEntityMapper.fromDomain(player.getDeck()))
            .build();
    }

    static List<PlayerEntity> fromDomain(List<Player> players) {
        return List.ofAll(players.map(player -> fromDomain(player)));
    }
}
