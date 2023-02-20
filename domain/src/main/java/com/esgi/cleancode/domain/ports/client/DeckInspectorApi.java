package com.esgi.cleancode.domain.ports.client;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Deck;

import io.vavr.control.Either;

public interface DeckInspectorApi {
    
    Either<ApplicationError, Deck> inspect(Deck deck);

}
