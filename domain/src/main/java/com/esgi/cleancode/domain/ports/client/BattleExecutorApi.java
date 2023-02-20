package com.esgi.cleancode.domain.ports.client;

import java.util.Set;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Battle;
import com.esgi.cleancode.domain.functional.model.Hero;

import io.vavr.control.Either;

public interface BattleExecutorApi {
    
    Either<ApplicationError, Battle> engage(Set<Hero> members);

    Either<ApplicationError, Battle> attack(Set<Hero> members);
    
}
