package com.esgi.cleancode.domain.functional.model;

import java.util.UUID;

import com.esgi.cleancode.domain.functional.enums.PackEnum;

public interface Pack { 

    UUID getId();
    int getPrice();
    int getCardNumber();
    PackEnum getPackRarity();
 }
