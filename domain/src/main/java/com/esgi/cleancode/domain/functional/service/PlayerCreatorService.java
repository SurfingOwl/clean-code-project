package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ports.client.PlayerApi;
import com.esgi.cleancode.domain.ports.server.PlayerPersistenceSpi;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlayerCreatorService implements PlayerApi {
    
    private final PlayerPersistenceSpi spi;
    
}
