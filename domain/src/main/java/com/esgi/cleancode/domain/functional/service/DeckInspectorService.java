package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Deck;
import com.esgi.cleancode.domain.ports.client.DeckInspectorApi;
import com.esgi.cleancode.domain.ports.server.DeckPersistenceSpi;

import io.vavr.control.Either;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeckInspectorService implements DeckInspectorApi {

    private final DeckPersistenceSpi spi;

    @Override
    public Either<ApplicationError, Deck> inspect(Deck deck) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
