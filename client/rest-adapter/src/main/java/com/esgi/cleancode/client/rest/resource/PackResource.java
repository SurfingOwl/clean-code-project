package com.esgi.cleancode.client.rest.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esgi.cleancode.client.rest.dto.PackOpenerDto;
import com.esgi.cleancode.client.rest.mapper.PackDtoMapper;
import com.esgi.cleancode.domain.ports.client.PackOpenerApi;
import com.esgi.cleancode.domain.ports.client.PlayerFinderApi;

import lombok.RequiredArgsConstructor;

import java.util.UUID;

import org.springframework.http.ResponseEntity;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pack")
public class PackResource {
    
    private final PackOpenerApi packOpenerApi;
    private final PlayerFinderApi playerFinderApi;

    @PostMapping("{playerId}")
    public ResponseEntity<Object> openPack(@PathVariable String playerId, @RequestBody PackOpenerDto packOpenerDto) {
        return packOpenerApi
            .open(playerFinderApi.find(UUID.fromString(playerId)).get(),
            PackDtoMapper.toDomain(packOpenerDto))
            .map(PackDtoMapper::toDto)
            .fold(ResponseEntity.badRequest()::body, ResponseEntity::ok);
    }
    
}
