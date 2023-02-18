package com.esgi.cleancode.domain.ports.client;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Player;

import io.vavr.control.Either;

public interface PlayerFinderApi {
    
    Either<ApplicationError, Player> inspect(Player player);

    Either<ApplicationError, Iterable<Player>> search();
    
}
