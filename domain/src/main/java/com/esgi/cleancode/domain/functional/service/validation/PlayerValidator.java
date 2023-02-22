package com.esgi.cleancode.domain.functional.service.validation;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Player;

import io.vavr.control.Validation;

public interface PlayerValidator {
    
    static Validation<ApplicationError, Player> validate(Player player) {
        // TODO
        return null;
    }
}
