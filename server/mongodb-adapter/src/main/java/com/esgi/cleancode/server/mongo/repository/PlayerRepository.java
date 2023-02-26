package com.esgi.cleancode.server.mongo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esgi.cleancode.server.mongo.entity.PlayerEntity;

public interface PlayerRepository extends JpaRepository<PlayerEntity, UUID> {}
