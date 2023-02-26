package com.esgi.cleancode.client.rest.dto;

import com.esgi.cleancode.domain.functional.enums.RarityEnum;
import com.esgi.cleancode.domain.functional.enums.SpecialityEnum;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public record HeroCreationDto(
    @JsonProperty("name") String name,
    @JsonProperty("rarity") RarityEnum rarity,
    @JsonProperty("speciality") SpecialityEnum  speciality
) {  }
