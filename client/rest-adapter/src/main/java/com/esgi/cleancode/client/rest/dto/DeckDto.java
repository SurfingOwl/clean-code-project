package com.esgi.cleancode.client.rest.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import io.vavr.collection.List;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

import java.util.UUID;

@JsonAutoDetect(fieldVisibility = ANY)
public record DeckDto(
    UUID id,
    List<HeroDto> heroes
) {}
