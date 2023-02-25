package com.esgi.cleancode.domain.functional.model;

import java.util.UUID;

import lombok.Builder;
import lombok.Builder.Default;
import lombok.Value;
import lombok.With;

@Value
@Builder
public class Player {
    
    @Default
    UUID id = UUID.randomUUID();
    String name;
    @Default @With
    int balance = 4;
    @Default
    Deck deck = new Deck();

}
