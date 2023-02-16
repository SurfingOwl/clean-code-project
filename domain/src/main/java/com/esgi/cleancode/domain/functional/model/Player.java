package com.esgi.cleancode.domain.functional.model;

import lombok.Builder;
import lombok.Builder.Default;
import lombok.Generated;
import lombok.Value;

@Value
@Builder
public class Player {
    
    @Generated
    long id;
    String name;
    @Default
    int balance = 4;
    @Default
    Deck deck = new Deck();

}
