package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ports.client.PlayerCreatorApi;
import com.esgi.cleancode.domain.ports.server.PlayerPersistenceSpi;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlayerCreatorService implements PlayerCreatorApi {
    
    private final PlayerPersistenceSpi spi;
    
}
