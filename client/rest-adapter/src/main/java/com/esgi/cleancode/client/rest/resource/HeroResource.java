package com.esgi.cleancode.client.rest.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esgi.cleancode.client.rest.dto.HeroCreationDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Hero")
public class HeroResource {
    
    @GetMapping
    ResponseEntity<Object> searchAllHeroes() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("{heroId}")
    ResponseEntity<Object> findOneHero(@PathVariable String heroId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    ResponseEntity<Object> createHero(@RequestBody HeroCreationDto heroCreationDto) {
        return ResponseEntity.ok().build();
    }
}
