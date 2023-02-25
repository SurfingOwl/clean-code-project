package com.esgi.cleancode.client.rest.dto;

import com.esgi.cleancode.domain.functional.enums.BattleStatusEnum;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import io.vavr.collection.Map;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

import java.util.UUID;

@JsonAutoDetect(fieldVisibility = ANY)
public record BattleDto(
    UUID id,
    Map<HeroDto, HeroDto> fighters,
    BattleStatusEnum status
) {}
