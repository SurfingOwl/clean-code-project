package com.esgi.cleancode.server.mongo.repository;

import java.util.UUID;
import com.esgi.cleancode.server.mongo.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerEntity, UUID> {
    
}
