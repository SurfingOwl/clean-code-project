package com.esgi.cleancode.domain.ports.client;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Deck;
import com.esgi.cleancode.domain.functional.model.Pack;
import com.esgi.cleancode.domain.functional.model.Player;

import io.vavr.control.Either;

public interface PackOpenerApi {
    
    Either<ApplicationError, Player> open(Player player, Pack pack);

}
