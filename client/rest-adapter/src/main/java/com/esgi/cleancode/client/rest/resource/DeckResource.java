package com.esgi.cleancode.client.rest.resource;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esgi.cleancode.client.rest.mapper.DeckDtoMapper;
import com.esgi.cleancode.domain.ports.client.DeckInspectorApi;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/deck")
public class DeckResource {

    private final DeckInspectorApi deckInspectorApi;
    
    @GetMapping("{deckId}")
    ResponseEntity<Object> inspectDeck(@PathVariable String deckId) {
        return deckInspectorApi.find(UUID.fromString(deckId))
            .map(DeckDtoMapper::toDto)
            .fold(ResponseEntity.badRequest()::body, ResponseEntity::ok);
    }
}
