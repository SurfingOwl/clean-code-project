package com.esgi.cleancode.domain.functional.model;

import java.util.UUID;

import io.vavr.collection.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Deck {

    @Default
    UUID id = UUID.randomUUID();
    @Default
    List<Hero> heroes = List.of();
    
}