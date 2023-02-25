package com.esgi.cleancode.client.rest.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

import java.util.UUID;

@JsonAutoDetect(fieldVisibility = ANY)
public record PlayerDto(
    UUID id,
    String name,
    int balance,
    DeckDto deck
) {}
