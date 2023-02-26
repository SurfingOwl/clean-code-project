package com.esgi.cleancode.server.mongo.entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.esgi.cleancode.domain.functional.enums.BattleStatusEnum;

import io.vavr.collection.Map;
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
@Document(collection = "battle")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BattleEntity {
 
    @Id
    @Include
    private UUID id;

    private Map<HeroEntity, HeroEntity> fighters;

    BattleStatusEnum status;
}
