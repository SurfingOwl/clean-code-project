package com.esgi.cleancode.domain.ports.server;

import java.util.UUID;

import com.esgi.cleancode.domain.functional.model.Player;

public interface PlayerPersistenceSpi extends PersistenceSpi<Player, UUID> {  }
