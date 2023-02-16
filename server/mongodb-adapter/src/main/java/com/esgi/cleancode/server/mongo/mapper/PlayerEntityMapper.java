package com.esgi.cleancode.server.mongo.mapper;

import com.esgi.cleancode.domain.functional.model.Player;
import com.esgi.cleancode.server.mongo.entity.PlayerEntity;

public interface PlayerEntityMapper {
    
    Player toDomain(PlayerEntity entity);

    PlayerEntity fromDomain(Player player);
}
