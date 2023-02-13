package com.esgi.cleancode.server.mongo.entity;

import javax.persistence.*;
import lombok.*;

import static javax.persistence.CascadeType.ALL;

@Entity
@Getter
@Setter
@Builder
// @NoArgsConstructor TODO à réintégrer lors de l'implémentation
// @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table()
public class PlayerEntity {
    
}
