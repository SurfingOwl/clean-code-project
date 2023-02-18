package com.esgi.cleancode.domain.functional.service.validation;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Battle;

import io.vavr.control.Either;

public interface BattleValidator {
    
    static Either<ApplicationError, Battle> validate(Battle battle) {
        // TODO
        return null;
    }
}
