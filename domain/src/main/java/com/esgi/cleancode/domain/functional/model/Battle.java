package com.esgi.cleancode.domain.functional.model;

import java.util.Map;

import lombok.Generated;
import lombok.Value;

@Value
public class Battle {
    
    @Generated
    long id;
    Map<Player, Player> fighters;
    
}
