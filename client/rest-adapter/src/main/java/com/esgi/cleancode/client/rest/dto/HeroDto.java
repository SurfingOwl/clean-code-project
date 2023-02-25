package com.esgi.cleancode.client.rest.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

import java.util.UUID;

import com.esgi.cleancode.domain.functional.enums.RarityEnum;
import com.esgi.cleancode.domain.functional.enums.SpecialityEnum;

@JsonAutoDetect(fieldVisibility = ANY)
public record HeroDto(
    UUID id,
    String name,
    double healthPoint,
    double power,
    double armor,
    int experiencePoints,
    int level,
    RarityEnum rarity,
    SpecialityEnum speciality
) {}
