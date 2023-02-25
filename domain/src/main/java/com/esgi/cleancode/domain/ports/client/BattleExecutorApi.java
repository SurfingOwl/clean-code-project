package com.esgi.cleancode.domain.ports.client;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Battle;
import com.esgi.cleancode.domain.functional.model.Hero;

import io.vavr.control.Either;

public interface BattleExecutorApi {
    
    Either<ApplicationError, Battle> engage(Hero attacker, Hero attacked);

    Either<ApplicationError, Battle> attack(Battle battle, Hero Attacker);
    
}
