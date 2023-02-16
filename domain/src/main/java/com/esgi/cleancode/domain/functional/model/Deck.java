package com.esgi.cleancode.domain.functional.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Deck {

    @Generated
    long id;
    List<Hero> heroes;
    
}