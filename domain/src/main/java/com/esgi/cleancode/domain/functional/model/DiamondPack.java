package com.esgi.cleancode.domain.functional.model;

import java.util.UUID;

import com.esgi.cleancode.domain.functional.enums.PackEnum;
import com.esgi.cleancode.domain.functional.enums.RarityEnum;

import io.vavr.collection.HashMap;
import io.vavr.collection.Map;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Value;

@Value
@Builder
public class DiamondPack implements Pack {
    
    @Default
    UUID id = UUID.randomUUID();
    int price = 2;
    int cardNumber = 5;
    PackEnum packRarity;
    Map<RarityEnum, Double> dropChances = HashMap.of(
        RarityEnum.COMMON, 0.5,
        RarityEnum.RARE, 0.35,
        RarityEnum.LEGENDARY, 0.15
        );
}
