package com.esgi.cleancode.server.mongo.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import com.esgi.cleancode.domain.functional.enums.RarityEnum;
import com.esgi.cleancode.domain.functional.enums.SpecialityEnum;

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
@Table(name="HERO")
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

    @Enumerated(EnumType.STRING)
    private RarityEnum rarity;

    @Enumerated(EnumType.STRING)
    private SpecialityEnum speciality;
}
