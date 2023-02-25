package com.esgi.cleancode.domain.functional.service.validation;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Battle;

import io.vavr.control.Validation;

import static io.vavr.API.Invalid;
import static io.vavr.API.Valid;

public interface BattleValidator {
    
    static Validation<ApplicationError, Battle> validateEngage(Battle battle) {
        return battle.getFighters().get()._1().getLevel() > battle.getFighters().get()._2().getLevel()
            ? Valid(battle)
            : Invalid(new ApplicationError("Battle Control", "Hero's level is too high to engage battle", battle, null));
    }
}
