package com.esgi.cleancode.domain.ports.server;

import java.util.UUID;

import com.esgi.cleancode.domain.functional.model.Hero;

public interface HeroPersistenceSpi extends PersistenceSpi<Hero, UUID> {  }
