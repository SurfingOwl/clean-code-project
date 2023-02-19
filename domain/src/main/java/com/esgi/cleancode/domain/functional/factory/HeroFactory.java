package com.esgi.cleancode.domain.functional.factory;

import com.esgi.cleancode.domain.functional.enums.RarityEnum;
import com.esgi.cleancode.domain.functional.enums.SpecialityEnum;
import com.esgi.cleancode.domain.functional.errors.HeroFactoryException;
import com.esgi.cleancode.domain.functional.model.Assassin;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.functional.model.Mage;
import com.esgi.cleancode.domain.functional.model.Tank;

public class HeroFactory {

    // TODO buildFromHero

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

    private static double getRarityBonus(int value, RarityEnum rarity) throws HeroFactoryException {
        switch(rarity) {
            case COMMON:
                return value;
            case RARE:
                return value + value*0.1;
            case LEGENDARY:
                return value + value*0.2;
            default:
                throw new HeroFactoryException("Rarity Error");
        }
    }
}
