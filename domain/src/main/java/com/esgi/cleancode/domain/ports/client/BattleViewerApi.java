package com.esgi.cleancode.domain.ports.client;

import java.util.UUID;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Battle;

import io.vavr.collection.List;
import io.vavr.control.Either;

public interface BattleViewerApi {

    Either<ApplicationError, Battle> findById(UUID id);

    Either<ApplicationError, List<Battle>> findByHeroId(UUID id);
    
}
