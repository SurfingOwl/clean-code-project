package com.esgi.cleancode.client.rest.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esgi.cleancode.client.rest.dto.PackOpenerDto;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pack")
public class PackResource {
    
    @PostMapping
    public ResponseEntity<Object> openPack(@RequestBody PackOpenerDto packOpenerDto) {
        return ResponseEntity.ok().build();
    }
    
}
