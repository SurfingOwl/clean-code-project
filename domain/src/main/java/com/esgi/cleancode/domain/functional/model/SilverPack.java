package com.esgi.cleancode.domain.functional.model;

import java.util.UUID;

import com.esgi.cleancode.domain.functional.enums.PackEnum;

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
    PackEnum packRarity = PackEnum.SILVER;
}
