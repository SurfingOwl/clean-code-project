package com.esgi.cleancode.server.mongo.entity;

import lombok.*;
import lombok.EqualsAndHashCode.Include;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "player")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PlayerEntity {
    
    @Id
    @Include
    private UUID id;

    private String name;

    private int balance;
    
    @OneToOne(cascade = CascadeType.ALL)
    private DeckEntity deck;
}
