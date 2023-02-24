package com.esgi.cleancode.domain.functional.service.validation;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Battle;

import io.vavr.collection.List;
import io.vavr.control.Validation;

import static io.vavr.API.Valid;
import static io.vavr.API.Invalid;

public interface BattleSearchValidator {

    static Validation<ApplicationError, List<Battle>> validate(List<Battle> battles) {
        return battles.nonEmpty()
            ? Valid(battles)
            : Invalid(new ApplicationError(null, null, null, null));
    }
}
