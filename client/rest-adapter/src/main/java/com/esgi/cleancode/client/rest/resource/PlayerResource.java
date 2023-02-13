package com.esgi.cleancode.client.rest.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esgi.cleancode.client.rest.dto.PlayerCreationDto;
import com.esgi.cleancode.domain.ports.client.PlayerApi;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/player")
public class PlayerResource {

    private final PlayerApi PlayerApi;

    @PostMapping
    ResponseEntity<Object> createPlayer(@RequestBody PlayerCreationDto dto) {
        return ResponseEntity.ok().build();
    }
}
