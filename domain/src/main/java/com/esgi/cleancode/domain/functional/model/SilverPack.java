package com.esgi.cleancode.domain.functional.model;

import java.util.Map;

import com.esgi.cleancode.domain.functional.enums.RarityEnum;

import lombok.Builder;
import lombok.Generated;
import lombok.Value;

@Value
@Builder
public class SilverPack implements Pack {
    
    @Generated
    long id;
    int price = 1;
    int cardNumber = 3;
    Map<RarityEnum, Double> dropChances = Map.of(
        RarityEnum.COMMON, 0.75,
        RarityEnum.RARE, 0.2,
        RarityEnum.LEGENDARY, 0.05
        );

}
