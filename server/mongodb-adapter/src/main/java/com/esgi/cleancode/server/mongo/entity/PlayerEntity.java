package com.esgi.cleancode.server.mongo.entity;

import lombok.*;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "players")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PlayerEntity {
    
    @Id
    private UUID id;
    
    private String name;
    
    private int balance;
    
    @OneToOne
    @JoinColumn(name = "deck_id")
    private DeckEntity deck;
}
