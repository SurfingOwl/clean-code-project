package com.esgi.cleancode.domain.ports.client;

import java.util.UUID;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Player;

import io.vavr.collection.List;
import io.vavr.control.Either;

public interface PlayerFinderApi {
    
    Either<ApplicationError, Player> find(UUID id);
    
    Either<ApplicationError, List<Player>> search();
    
}
