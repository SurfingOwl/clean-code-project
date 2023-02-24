package com.esgi.cleancode.domain.functional.model;

import java.util.UUID;

import com.esgi.cleancode.domain.functional.enums.PackEnum;
import com.esgi.cleancode.domain.functional.enums.RarityEnum;

import io.vavr.collection.Map;

public interface Pack { 

    UUID getId();
    int getPrice();
    int getCardNumber();
    Map<RarityEnum, Double> getDropChances();
    PackEnum getPackRarity();
 }
