package com.esgi.cleancode.server.mongo.entity;

import java.util.UUID;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.Table;


import com.esgi.cleancode.domain.functional.enums.BattleStatusEnum;

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
@Table(name = "battles")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BattleEntity {
 
    @Id
    private UUID id;
    
    @ElementCollection
    @CollectionTable(name = "battle_fighters", joinColumns = @JoinColumn(name = "battle_id"))
    @MapKeyJoinColumn(name = "hero_id")
    @Column(name = "opponent_hero_id")
    private Map<HeroEntity, HeroEntity> fighters;
    
    @Enumerated(EnumType.STRING)
    private BattleStatusEnum status;
}
