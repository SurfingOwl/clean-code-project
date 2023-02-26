package com.esgi.cleancode.server.mongo.entity;

import java.util.UUID;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.esgi.cleancode.domain.functional.enums.RarityEnum;
import com.esgi.cleancode.domain.functional.enums.SpecialityEnum;

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
@Table(name = "hero")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class HeroEntity {
    
    @Id
    @Include
    private UUID id;

    private String name;

    private double healthPoint;

    private double power;

    private double armor;

    private int experiencePoints;

    private int level;

    private RarityEnum rarity;

    private SpecialityEnum speciality;
}
