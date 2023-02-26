package com.esgi.cleancode.server.mongo.entity;

import lombok.*;
import lombok.EqualsAndHashCode.Include;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "player")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PlayerEntity {
    
    @Id
    @Include
    private UUID id;

    private String name;

    private int balance;
    
    private DeckEntity deck;
}
