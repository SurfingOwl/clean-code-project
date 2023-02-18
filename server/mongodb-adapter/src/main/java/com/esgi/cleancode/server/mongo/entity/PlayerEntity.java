package com.esgi.cleancode.server.mongo.entity;

import javax.persistence.*;

import lombok.*;
import lombok.EqualsAndHashCode.Include;

import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name="PLAYER")
public class PlayerEntity {
    
    @Id
    @Include
    private UUID id;

    private String name;

    private int balance;
    
    @OneToOne
    private DeckEntity deck;
}
