package com.esgi.cleancode.server.mongo.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.vavr.collection.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "deck")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DeckEntity {
    
    @Id
    @Include
    private UUID id;

    private List<HeroEntity> heroes;
}
