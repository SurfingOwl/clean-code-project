package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Deck;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.ports.client.DeckAppenderApi;
import com.esgi.cleancode.domain.ports.server.DeckPersistenceSpi;

import io.vavr.control.Either;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeckAppenderService implements DeckAppenderApi {

    private final DeckPersistenceSpi spi;

    @Override
    public Either<ApplicationError, Deck> add(Deck deck, Iterable<Hero> heroes) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
