package com.esgi.cleancode.domain.functional.model;

import java.util.Map;
import java.util.UUID;

import com.esgi.cleancode.domain.functional.enums.RarityEnum;

public interface Pack { 

    UUID getId();
    int getPrice();
    int getCardNumber();
    Map<RarityEnum, Double> getDropChances();
    
 }
