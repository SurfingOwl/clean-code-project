package com.esgi.cleancode.client.rest.dto;

import com.esgi.cleancode.domain.functional.enums.RarityEnum;
import com.esgi.cleancode.domain.functional.enums.SpecialityEnum;
import com.fasterxml.jackson.annotation.JsonProperty;

public record HeroCreationDto(
    @JsonProperty("") String name,
    @JsonProperty("") RarityEnum rarity,
    @JsonProperty("") SpecialityEnum  speciality
) {  }
