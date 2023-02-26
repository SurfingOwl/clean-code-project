package com.esgi.cleancode.server.mongo.entity;

import java.util.UUID;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import com.esgi.cleancode.domain.functional.enums.BattleStatusEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.EqualsAndHashCode.Include;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "battle")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BattleEntity {
 
    @Id
    @Include
    private UUID id;

    @ManyToMany(cascade = CascadeType.ALL)
    private Map<HeroEntity, HeroEntity> fighters;

    BattleStatusEnum status;
}
