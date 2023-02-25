package com.esgi.cleancode.client.rest.resource;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esgi.cleancode.client.rest.dto.BattleAttackDto;
import com.esgi.cleancode.client.rest.dto.BattleCreationDto;
import com.esgi.cleancode.client.rest.mapper.BattleDtoMapper;
import com.esgi.cleancode.domain.ports.client.BattleExecutorApi;
import com.esgi.cleancode.domain.ports.client.BattleViewerApi;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/battle")
public class BattleResource {
    
    private final BattleViewerApi battleViewerApi;
    private final BattleExecutorApi battleExecutorApi;

    @GetMapping("{heroId}")
    ResponseEntity<Object> viewHerosBattles(@PathVariable String heroId) {
        return battleViewerApi.findByHeroId(UUID.fromString(heroId))
            .map(BattleDtoMapper::toDto)
            .fold(ResponseEntity.badRequest()::body, ResponseEntity::ok);
    }

    @PostMapping()
    ResponseEntity<Object> engageBattle(@RequestBody BattleCreationDto battleCreationDto) {
        return battleExecutorApi.engage(battleCreationDto.attacker(), battleCreationDto.attacked())
            .map(BattleDtoMapper::toDto)
            .fold(ResponseEntity.badRequest()::body, ResponseEntity::ok);
    }

    @PostMapping("{battleId}")
    ResponseEntity<Object> performAttack(@PathVariable String battleId, @RequestBody BattleAttackDto BattleAttackDto) {
        return battleExecutorApi.attack(battleViewerApi.findById(UUID.fromString(battleId)).get(), BattleAttackDto.attacker())
            .map(BattleDtoMapper::toDto)
            .fold(ResponseEntity.badRequest()::body, ResponseEntity::ok);
    }
}
