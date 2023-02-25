package com.esgi.cleancode.client.rest.mapper;

import com.esgi.cleancode.client.rest.dto.DeckDto;
import com.esgi.cleancode.domain.functional.model.Deck;

public interface DeckDtoMapper {
    
    static Deck toDomain() {
        return Deck.builder().build();
    }

    static DeckDto toDto(Deck deck) {
        return new DeckDto(deck.getId(), HeroDtoMapper.toDto(deck.getHeroes()));
    }
}
