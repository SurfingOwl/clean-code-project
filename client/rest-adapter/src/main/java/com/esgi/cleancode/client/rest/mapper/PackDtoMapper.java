package com.esgi.cleancode.client.rest.mapper;

import com.esgi.cleancode.client.rest.dto.DeckDto;
import com.esgi.cleancode.client.rest.dto.PackOpenerDto;
import com.esgi.cleancode.domain.functional.factory.PackFactory;
import com.esgi.cleancode.domain.functional.model.Deck;
import com.esgi.cleancode.domain.functional.model.Pack;

public interface PackDtoMapper {
    
    static Pack toDomain(PackOpenerDto packOpenerDto) {
        return PackFactory.buildPack(packOpenerDto.packRarity());
    }

    static DeckDto toDto(Deck deck) {
        return new DeckDto(
            deck.getId(), 
            HeroDtoMapper.toDto(deck.getHeroes()));
    }
}
