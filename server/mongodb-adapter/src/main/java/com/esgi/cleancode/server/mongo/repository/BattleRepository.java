package com.esgi.cleancode.server.mongo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esgi.cleancode.server.mongo.entity.BattleEntity;

public interface BattleRepository extends JpaRepository<BattleEntity, UUID> {}
