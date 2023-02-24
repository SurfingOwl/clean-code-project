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
public class SilverPack implements Pack {
    
    @Default
    UUID id = UUID.randomUUID();
    int price = 1;
    int cardNumber = 3;
    PackEnum packRarity;
    Map<RarityEnum, Double> dropChances = HashMap.of(
        RarityEnum.COMMON, 0.75,
        RarityEnum.RARE, 0.2,
        RarityEnum.LEGENDARY, 0.05
        );

}
