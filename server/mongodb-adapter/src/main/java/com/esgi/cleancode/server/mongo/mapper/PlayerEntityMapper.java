package com.esgi.cleancode.server.mongo.mapper;

import java.util.Optional;

import com.esgi.cleancode.domain.functional.model.Player;
import com.esgi.cleancode.server.mongo.entity.DeckEntity;
import com.esgi.cleancode.server.mongo.entity.PlayerEntity;
import com.esgi.cleancode.server.mongo.repository.DeckRepository;

import io.vavr.collection.List;
import io.vavr.control.Option;

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

    static PlayerEntity fromDomain(Player player, DeckRepository deckRepository) {
        PlayerEntity entity = new PlayerEntity();
        Optional<DeckEntity> deckEntity = deckRepository.findById(player.getDeck().getId());
        
        entity.setId(player.getId());
        entity.setName(player.getName());
        entity.setBalance(player.getBalance());
        
        if (deckEntity.isPresent())
            entity.setDeck(deckEntity.get());
        else {
            DeckEntity newDeck = DeckEntityMapper.fromDomain(player.getDeck());
            entity.setDeck(newDeck);
            deckRepository.save(newDeck);
        }

        return entity;
    }

    static List<PlayerEntity> fromDomain(List<Player> players) {
        return List.ofAll(players.map(player -> fromDomain(player, null)));
    }
}
