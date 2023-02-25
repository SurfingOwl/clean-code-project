package com.esgi.cleancode.client.rest.mapper;

import com.esgi.cleancode.client.rest.dto.HeroCreationDto;
import com.esgi.cleancode.client.rest.dto.HeroToDeckDto;
import com.esgi.cleancode.domain.functional.model.Hero;

public interface HeroDtoMapper {
    
    Hero toDomain(HeroToDeckDto dto);

    Hero toDomain(HeroCreationDto dto);

    HeroCreationDto toHeroCreationDto(Hero hero);

    HeroToDeckDto toHeroToDeckDto(Hero hero);
}
