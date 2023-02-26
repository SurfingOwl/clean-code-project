package com.esgi.cleancode.client.rest.resource;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esgi.cleancode.client.rest.dto.HeroCreationDto;
import com.esgi.cleancode.client.rest.mapper.HeroDtoMapper;
import com.esgi.cleancode.domain.ports.client.HeroCreatorApi;
import com.esgi.cleancode.domain.ports.client.HeroFinderApi;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hero")
public class HeroResource {
    
    private final HeroCreatorApi heroCreatorApi;
    private final HeroFinderApi heroFinderApi;

    @GetMapping
    ResponseEntity<Object> searchAllHeroes() {
        return heroFinderApi.search()
            .map(HeroDtoMapper::toDto)
            .fold(ResponseEntity.badRequest()::body, ResponseEntity::ok);
    }

    @GetMapping("{heroId}")
    ResponseEntity<Object> findOneHero(@PathVariable String heroId) {
        return heroFinderApi.find(UUID.fromString(heroId))
            .map(HeroDtoMapper::toDto)
            .fold(ResponseEntity.badRequest()::body, ResponseEntity::ok);
    }

    @PostMapping
    ResponseEntity<Object> createHero(@RequestBody HeroCreationDto heroCreationDto) {
        return heroCreatorApi.create(heroCreationDto.name(), heroCreationDto.rarity(), heroCreationDto.speciality())
            .map(HeroDtoMapper::toDto)
            .fold(ResponseEntity.badRequest()::body, ResponseEntity::ok);
    }
}
