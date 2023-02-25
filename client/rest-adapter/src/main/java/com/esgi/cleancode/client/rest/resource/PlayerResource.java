package com.esgi.cleancode.client.rest.resource;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esgi.cleancode.client.rest.dto.PlayerCreationDto;
import com.esgi.cleancode.client.rest.mapper.PlayerDtoMapper;
import com.esgi.cleancode.domain.ports.client.PlayerCreatorApi;
import com.esgi.cleancode.domain.ports.client.PlayerFinderApi;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/player")
public class PlayerResource {

    private final PlayerCreatorApi PlayerCreatorApi;
    private final PlayerFinderApi playerFinderApi;

    @GetMapping
    ResponseEntity<Object> getAllPlayers() {
        return playerFinderApi.search()
            .map(PlayerDtoMapper::toDto)
            .fold(ResponseEntity.badRequest()::body, ResponseEntity::ok);
    }

    @GetMapping("{playerId}")
    ResponseEntity<Object> getPlayer(@PathVariable String playerId) {
        return playerFinderApi.find(UUID.fromString(playerId))
            .map(PlayerDtoMapper::toDto)
            .fold(ResponseEntity.badRequest()::body, ResponseEntity::ok);
    }

    @PostMapping
    ResponseEntity<Object> createPlayer(@RequestBody PlayerCreationDto playerCreationDto) {
        return PlayerCreatorApi.create(playerCreationDto.name())
            .map(PlayerDtoMapper::toDto)
            .fold(ResponseEntity.badRequest()::body, ResponseEntity::ok);
    }
}
