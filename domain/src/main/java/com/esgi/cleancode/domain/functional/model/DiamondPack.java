package com.esgi.cleancode.domain.functional.model;

import java.util.Map;

import com.esgi.cleancode.domain.functional.enums.RarityEnum;

import lombok.Builder;
import lombok.Generated;
import lombok.Value;

@Value
@Builder
public class DiamondPack implements Pack {
    
    @Generated
    long id;
    int price = 2;
    int cardNumber = 5;
    Map<RarityEnum, Double> dropChances = Map.of(
        RarityEnum.COMMON, 0.5,
        RarityEnum.RARE, 0.35,
        RarityEnum.LEGENDARY, 0.15
        );

}
