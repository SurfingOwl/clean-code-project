package com.esgi.cleancode.server.mongo.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "decks")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DeckEntity {
    
    @Id
    private UUID id;
    
    @ManyToMany
    @JoinTable(
        name = "deck_heroes",
        joinColumns = @JoinColumn(name = "deck_id"),
        inverseJoinColumns = @JoinColumn(name = "hero_id"))
    private List<HeroEntity> heroes;
}
