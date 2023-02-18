package com.esgi.cleancode.domain.ports.server;

import java.util.UUID;

import com.esgi.cleancode.domain.functional.model.Deck;

public interface DeckPersistenceSpi extends PersistenceSpi<Deck, UUID> {  }
