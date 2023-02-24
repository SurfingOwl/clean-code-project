package com.esgi.cleancode.client.rest.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esgi.cleancode.client.rest.dto.AddHeroToDeckDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/deck")
public class DeckResource {
    
    @GetMapping("{deckId}")
    ResponseEntity<Object> inspectDeck(@PathVariable String deckId) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("{deckId}")
    ResponseEntity<Object> addToDeck(@PathVariable String deckId, @RequestBody AddHeroToDeckDto addHeroToDeckDto) {
        return ResponseEntity.ok().build();
    }
}
