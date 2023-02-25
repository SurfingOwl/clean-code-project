package com.esgi.cleancode.domain.ports.client;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Player;

import io.vavr.control.Either;

public interface PlayerCreatorApi {
    
    Either<ApplicationError, Player> create(String name);

    Either<ApplicationError, Player> update(Player player);
}
