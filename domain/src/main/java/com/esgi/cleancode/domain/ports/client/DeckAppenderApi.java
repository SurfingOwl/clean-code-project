package com.esgi.cleancode.domain.ports.client;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Deck;
import com.esgi.cleancode.domain.functional.model.Hero;

import io.vavr.collection.List;
import io.vavr.control.Either;

public interface DeckAppenderApi {
    
    Either<ApplicationError, Deck> add(Deck deck, List<Hero> heroes);

}
