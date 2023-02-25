package com.esgi.cleancode.domain.functional.service;

import java.util.UUID;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Deck;
import com.esgi.cleancode.domain.ports.client.DeckInspectorApi;
import com.esgi.cleancode.domain.ports.server.DeckPersistenceSpi;

import io.vavr.control.Either;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class DeckInspectorService implements DeckInspectorApi {

    private final DeckPersistenceSpi spi;

    @Override
    public Either<ApplicationError, Deck> find(UUID id) {
        return spi.findById(id)
            .onEmpty(() -> log.error("Unable to find player's deck with id {}", id))
            .toEither(() -> new ApplicationError("Deck Error", null, id, null));
    }
   
}