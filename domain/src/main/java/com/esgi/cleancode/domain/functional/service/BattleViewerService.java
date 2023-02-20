package com.esgi.cleancode.domain.functional.service;

import java.util.Iterator;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Battle;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.ports.client.BattleViewerApi;
import com.esgi.cleancode.domain.ports.server.BattlePersistenceSpi;

import io.vavr.control.Either;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BattleViewerService implements BattleViewerApi {

    private final BattlePersistenceSpi spi;

    @Override
    public Either<ApplicationError, Iterator<Battle>> view(Hero hero) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
