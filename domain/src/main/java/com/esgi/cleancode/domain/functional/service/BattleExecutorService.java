package com.esgi.cleancode.domain.functional.service;

import java.util.Set;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Battle;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.ports.client.BattleExecutorApi;
import com.esgi.cleancode.domain.ports.server.BattlePersistenceSpi;

import io.vavr.control.Either;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BattleExecutorService implements BattleExecutorApi {

    private final BattlePersistenceSpi spi;

    @Override
    public Either<ApplicationError, Battle> engage(Set<Hero> members) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Either<ApplicationError, Battle> attack(Set<Hero> members) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
