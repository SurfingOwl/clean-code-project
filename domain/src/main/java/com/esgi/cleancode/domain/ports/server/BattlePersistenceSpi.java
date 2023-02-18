package com.esgi.cleancode.domain.ports.server;

import java.util.UUID;

import com.esgi.cleancode.domain.functional.model.Battle;

public interface BattlePersistenceSpi extends PersistenceSpi<Battle, UUID>{  }
