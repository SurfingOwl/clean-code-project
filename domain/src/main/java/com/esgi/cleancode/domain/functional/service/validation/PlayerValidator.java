package com.esgi.cleancode.domain.functional.service.validation;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Player;

import io.vavr.control.Either;

public interface PlayerValidator {
    
    static Either<ApplicationError, Player> validate(Player player) {
        // TODO
        return null;
    }
}
