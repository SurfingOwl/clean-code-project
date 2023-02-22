package com.esgi.cleancode.domain.functional.factory;

import java.util.UUID;

import com.esgi.cleancode.domain.functional.enums.RarityEnum;
import com.esgi.cleancode.domain.functional.enums.SpecialityEnum;
import com.esgi.cleancode.domain.functional.model.Assassin;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.functional.model.Mage;
import com.esgi.cleancode.domain.functional.model.Tank;

public class HeroFactory {

    public static Hero fromHero(UUID id,
                                String name,
                                Double healthPoint,
                                Double power,
                                Double armor,
                                int experiencePoints,
                                int level,
                                RarityEnum rarity,
                                SpecialityEnum speciality) {
        switch(speciality) {
            case ASSASSIN:
                return Assassin.builder()
                    .id(id)
                    .name(name)
                    .healthPoint(healthPoint)
                    .power(power)
                    .armor(armor)
                    .experiencePoints(experiencePoints)
                    .level(level)
                    .rarity(rarity)
                    .speciality(speciality)
                    .build();
            case MAGE:
                return Mage.builder()
                    .id(id)
                    .name(name)
                    .healthPoint(healthPoint)
                    .power(power)
                    .armor(armor)
                    .experiencePoints(experiencePoints)
                    .level(level)
                    .rarity(rarity)
                    .speciality(speciality)
                    .build();
            case TANK:
                return Tank.builder()
                    .id(id)
                    .name(name)
                    .healthPoint(healthPoint)
                    .power(power)
                    .armor(armor)
                    .experiencePoints(experiencePoints)
                    .level(level)
                    .rarity(rarity)
                    .speciality(speciality)
                    .build();
            default:
                return null; // TODO NOT CLEAN
        }
    }

    public static Hero createHero(String name, RarityEnum rarity, SpecialityEnum speciality) {
        switch(speciality) {
            case ASSASSIN:
                return Assassin.builder()
                    .name(name)
                    .healthPoint(applyRarityBonus(800, rarity))
                    .power(applyRarityBonus(200, rarity))
                    .armor(applyRarityBonus(5, rarity))
                    .build();
            case MAGE:
                return Mage.builder()
                    .name(name)
                    .healthPoint(applyRarityBonus(700, rarity))
                    .power(applyRarityBonus(150, rarity))
                    .armor(applyRarityBonus(10, rarity))
                    .build();
            case TANK:
                return Tank.builder()
                    .name(name)
                    .healthPoint(applyRarityBonus(1000, rarity))
                    .power(applyRarityBonus(100, rarity))
                    .armor(applyRarityBonus(20, rarity))
                    .build();
            default:
                return null; // TODO NOT CLEAN
        }
    }

    public static double applyRarityBonus(double d, RarityEnum rarity) {
        switch(rarity) {
            case COMMON:
                return d;
            case RARE:
                return d + d*0.1;
            case LEGENDARY:
                return d + d*0.2;
            default:
                return 0; // TODO NOT CLEAN
        }
    }
}
