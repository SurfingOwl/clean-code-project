package com.esgi.cleancode.domain.functional.model;

import java.util.UUID;

import io.vavr.collection.Map;
import lombok.Builder;
import lombok.Value;
import lombok.Builder.Default;

@Value
@Builder
public class Battle {
    
    @Default
    UUID id = UUID.randomUUID();
    Map<Hero, Hero> fighters;
    
}
