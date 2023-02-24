package com.esgi.cleancode.domain.ports.client;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Battle;
import com.esgi.cleancode.domain.functional.model.Hero;

import io.vavr.collection.List;
import io.vavr.control.Either;

public interface BattleViewerApi {
    
    Either<ApplicationError, List<Battle>> view(Hero hero);
    
}
