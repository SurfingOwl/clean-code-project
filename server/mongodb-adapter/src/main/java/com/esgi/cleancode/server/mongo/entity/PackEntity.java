package com.esgi.cleancode.server.mongo.entity;

import java.util.Map;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import com.esgi.cleancode.domain.functional.enums.RarityEnum;

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
@Table(name="PACK")
public class PackEntity {
    
    @Id
    @Include
    private UUID id;

    private int price;
    
    private int cardNumber;

    @Enumerated(EnumType.STRING)
    private Map<RarityEnum, Double> dropChances;
}
