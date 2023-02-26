package com.esgi.cleancode.client.rest.mapper;

import com.esgi.cleancode.client.rest.dto.HeroDto;
import com.esgi.cleancode.domain.functional.model.Hero;

import io.vavr.collection.List;

public interface HeroDtoMapper {
    
    static HeroDto toDto(Hero hero) {
        return new HeroDto(
            hero.getId(), 
            hero.getName(), 
            hero.getHealthPoint(), 
            hero.getPower(), 
            hero.getArmor(), 
            hero.getExperiencePoints(), 
            hero.getLevel(), 
            hero.getRarity(), 
            hero.getSpeciality());
    }

    static List<HeroDto> toDto(List<Hero> heroes) {
        return List.ofAll(heroes.map(hero -> toDto(hero)));
    }
}
