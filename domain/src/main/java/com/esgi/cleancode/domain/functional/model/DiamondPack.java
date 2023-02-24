package com.esgi.cleancode.domain.functional.model;

import java.util.UUID;

import com.esgi.cleancode.domain.functional.enums.PackEnum;

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
}
