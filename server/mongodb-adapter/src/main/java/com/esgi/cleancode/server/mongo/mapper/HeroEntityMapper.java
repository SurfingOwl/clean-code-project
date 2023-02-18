package com.esgi.cleancode.server.mongo.mapper;

import java.util.List;

import com.esgi.cleancode.domain.functional.errors.HeroFactoryException;
import com.esgi.cleancode.domain.functional.model.Assassin;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.functional.model.Mage;
import com.esgi.cleancode.domain.functional.model.Tank;
import com.esgi.cleancode.server.mongo.entity.HeroEntity;

public interface HeroEntityMapper {

    static Hero toDomain(HeroEntity entity) throws HeroFactoryException {
        switch(entity.getSpeciality()) {
            case ASSASSIN:
                return Assassin.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .healthPoint(entity.getHealthPoint())
                    .power(entity.getPower())
                    .armor(entity.getArmor())
                    .experiencePoints(entity.getExperiencePoints())
                    .level(entity.getLevel())
                    .rarity(entity.getRarity())
                    .speciality(entity.getSpeciality())
                    .build();
            case MAGE:
                return Mage.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .healthPoint(entity.getHealthPoint())
                    .power(entity.getPower())
                    .armor(entity.getArmor())
                    .experiencePoints(entity.getExperiencePoints())
                    .level(entity.getLevel())
                    .rarity(entity.getRarity())
                    .speciality(entity.getSpeciality())
                    .build();
            case TANK:
                return Tank.builder()
                    .id(entity.getId())
                    .name(entity.getName())
                    .healthPoint(entity.getHealthPoint())
                    .power(entity.getPower())
                    .armor(entity.getArmor())
                    .experiencePoints(entity.getExperiencePoints())
                    .level(entity.getLevel())
                    .rarity(entity.getRarity())
                    .speciality(entity.getSpeciality())
                    .build();
            default:
                throw new HeroFactoryException("Speciality Error");
        }
    }

    static List<Hero> listToDomain(List<HeroEntity> entities) {
        List<Hero> toDomain = List.of();
        entities.forEach(entity -> {
            try {
                toDomain.add(toDomain(entity));
            } catch (HeroFactoryException e) {
                e.printStackTrace();
            }
        });
        return toDomain;
    }

    static HeroEntity fromDomain(Hero hero) {
        return HeroEntity.builder()
            .id(hero.getId())
            .name(hero.getName())
            .healthPoint(hero.getHealthPoint())
            .power(hero.getPower())
            .armor(hero.getArmor())
            .experiencePoints(hero.getExperiencePoints())
            .level(hero.getLevel())
            .rarity(hero.getRarity())
            .speciality(hero.getSpeciality())
            .build();
    }

    static List<HeroEntity> listFromDomain(List<Hero> heroes) {
        List<HeroEntity> fromDomain = List.of();
        heroes.forEach(hero -> {
            fromDomain.add(fromDomain(hero));
        });
        return fromDomain;
    }
}
