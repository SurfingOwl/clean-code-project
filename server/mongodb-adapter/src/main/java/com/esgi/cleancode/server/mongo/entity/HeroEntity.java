package com.esgi.cleancode.server.mongo.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.esgi.cleancode.domain.functional.enums.RarityEnum;
import com.esgi.cleancode.domain.functional.enums.SpecialityEnum;

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
@Table(name = "heroes")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class HeroEntity {
    
    @Id
    private UUID id;
    
    private String name;
    
    @Column(name = "health_point")
    private double healthPoint;
    
    private double power;
    
    private double armor;
    
    @Column(name = "experience_points")
    private int experiencePoints;
    
    private int level;
    
    @Enumerated(EnumType.STRING)
    private RarityEnum rarity;
    
    @Enumerated(EnumType.STRING)
    private SpecialityEnum speciality;
}
