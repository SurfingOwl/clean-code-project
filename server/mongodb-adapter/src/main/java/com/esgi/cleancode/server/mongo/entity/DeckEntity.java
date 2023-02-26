package com.esgi.cleancode.server.mongo.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

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
@Entity
@Table(name = "deck")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DeckEntity {
    
    @Id
    @Include
    private UUID id;
    
    @ManyToMany(cascade = CascadeType.ALL)
    private List<HeroEntity> heroes;
}
