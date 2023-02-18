package com.esgi.cleancode.domain.functional.model;

import java.util.Set;
import java.util.UUID;

import lombok.Builder;
import lombok.Value;
import lombok.Builder.Default;

@Value
@Builder
public class Battle {
    
    @Default
    UUID id = UUID.randomUUID();
    Set<Player> fighters;
    
}
