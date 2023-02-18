package com.esgi.cleancode.domain.functional.model;

import java.util.UUID;

import com.esgi.cleancode.domain.functional.enums.RarityEnum;
import com.esgi.cleancode.domain.functional.enums.SpecialityEnum;

public interface Hero { 

    UUID getId();
    String getName();
    double getHealthPoint();
    double getPower();
    double getArmor();
    int getExperiencePoints();
    int getLevel();
    RarityEnum getRarity();
    SpecialityEnum getSpeciality();

 }
