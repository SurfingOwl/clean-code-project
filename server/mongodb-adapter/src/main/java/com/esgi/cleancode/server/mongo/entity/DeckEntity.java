package com.esgi.cleancode.server.mongo.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import io.vavr.collection.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name="DECK")
public class DeckEntity {
    
    @Id
    @Include
    private UUID id;

    @OneToMany
    private List<HeroEntity> heroes;
}
