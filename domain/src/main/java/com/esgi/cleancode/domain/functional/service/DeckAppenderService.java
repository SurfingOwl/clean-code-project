package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Deck;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.ports.client.DeckAppenderApi;
import com.esgi.cleancode.domain.ports.server.DeckPersistenceSpi;

import io.vavr.collection.List;
import io.vavr.control.Either;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeckAppenderService implements DeckAppenderApi {

    private final DeckPersistenceSpi spi;

    @Override
    public Either<ApplicationError, Deck> add(Deck deck, List<Hero> heroes) {
        return spi.save(
            Deck.builder()
            .id(deck.getId())
            .heroes(List.ofAll(deck.getHeroes().appendAll(heroes)))
            .build()
        );
    }
    
}
