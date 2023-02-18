package com.esgi.cleancode.domain.ports.client;

import java.util.Iterator;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Battle;
import com.esgi.cleancode.domain.functional.model.Hero;

import io.vavr.control.Either;

public interface BattleViewerApi {
    
    Either<ApplicationError, Iterator<Battle>> view(Hero hero);
    
}
