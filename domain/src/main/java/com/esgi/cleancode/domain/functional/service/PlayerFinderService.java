package com.esgi.cleancode.domain.functional.service;

import java.util.UUID;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Player;
import com.esgi.cleancode.domain.ports.client.PlayerFinderApi;
import com.esgi.cleancode.domain.ports.server.PlayerPersistenceSpi;

import io.vavr.collection.List;
import io.vavr.control.Either;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class PlayerFinderService implements PlayerFinderApi {

    private final PlayerPersistenceSpi spi;

    @Override
    public Either<ApplicationError, Player> find(UUID id) {
        return spi.findById(id)
            .onEmpty(() -> log.error("Could not find player with id {}", id))
            .toEither(() -> new ApplicationError("Player finder", null, id, null));
    }

    @Override
    public Either<ApplicationError, List<Player>> search() {
        return spi.findAll()
            .onEmpty(() -> log.error("Could not find player"))
            .toEither(() -> new ApplicationError("Player finder", null, null, null));
    }
    
}
