package com.esgi.cleancode.domain.functional.factory;

import java.util.UUID;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.enums.RarityEnum;
import com.esgi.cleancode.domain.functional.enums.SpecialityEnum;
import com.esgi.cleancode.domain.functional.errors.HeroFactoryException;
import com.esgi.cleancode.domain.functional.model.Assassin;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.functional.model.Mage;
import com.esgi.cleancode.domain.functional.model.Tank;

public class HeroFactory {

    // TODO buildFromHero
    public static Hero fromHero(UUID id,
                                String name,
                                Double healthPoint,
                                Double power,
                                Double armor,
                                int experiencePoints,
                                int level,
                                RarityEnum rarity,
                                SpecialityEnum speciality) throws HeroFactoryException {
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
                throw new HeroFactoryException();
        }
    }

    public static Hero createHero(String name, RarityEnum rarity, SpecialityEnum speciality) throws HeroFactoryException {
        switch(speciality) {
            case ASSASSIN:
                return Assassin.builder()
                    .name(name)
                    .healthPoint(getRarityBonus(800, rarity))
                    .power(getRarityBonus(200, rarity))
                    .armor(getRarityBonus(5, rarity))
                    .build();
            case MAGE:
                return Mage.builder()
                    .name(name)
                    .healthPoint(getRarityBonus(700, rarity))
                    .power(getRarityBonus(150, rarity))
                    .armor(getRarityBonus(10, rarity))
                    .build();
            case TANK:
                return Tank.builder()
                    .name(name)
                    .healthPoint(getRarityBonus(1000, rarity))
                    .power(getRarityBonus(100, rarity))
                    .armor(getRarityBonus(20, rarity))
                    .build();
            default:
                throw new HeroFactoryException("Speciality Error");
        }
    }

    public static double getRarityBonus(double d, RarityEnum rarity) throws HeroFactoryException {
        switch(rarity) {
            case COMMON:
                return d;
            case RARE:
                return d + d*0.1;
            case LEGENDARY:
                return d + d*0.2;
            default:
                throw new HeroFactoryException("Rarity Error");
        }
    }
}
