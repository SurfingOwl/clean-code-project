package com.esgi.cleancode.client.rest.resource;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esgi.cleancode.client.rest.dto.BattleCreationDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/battle")
public class BattleResource {
    
    @GetMapping("{heroId}")
    ResponseEntity<Object> viewHerosBattles(@PathVariable String heroId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping()
    ResponseEntity<Object> engageBattle(@RequestBody BattleCreationDto battleCreationDto) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("{battleId}")
    ResponseEntity<Object> performAttack(@PathVariable String battleId) {
        return ResponseEntity.ok().build();
    }
}
