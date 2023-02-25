package com.esgi.cleancode.server.mongo.mapper;

import com.esgi.cleancode.domain.functional.model.Deck;
import com.esgi.cleancode.server.mongo.entity.DeckEntity;

public interface DeckEntityMapper {
    
    static Deck toDomain(DeckEntity entity) {
        return Deck.builder()
            .id(entity.getId())
            .heroes(HeroEntityMapper.toDomain(entity.getHeroes()))
            .build();
    }

    static DeckEntity fromDomain(Deck deck) {
        return DeckEntity.builder()
            .id(deck.getId())
            .heroes(HeroEntityMapper.fromDomain(deck.getHeroes()))
            .build();
    }
}
