package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Player;
import com.esgi.cleancode.domain.ports.client.PlayerCreatorApi;
import com.esgi.cleancode.domain.ports.server.PlayerPersistenceSpi;

import io.vavr.control.Either;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlayerCreatorService implements PlayerCreatorApi {
    
    private final PlayerPersistenceSpi spi;

    @Override
    public Either<ApplicationError, Player> create(Player player) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
