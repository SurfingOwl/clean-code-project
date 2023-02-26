package com.esgi.cleancode.server.mongo.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
@Document(collection = "hero")
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
