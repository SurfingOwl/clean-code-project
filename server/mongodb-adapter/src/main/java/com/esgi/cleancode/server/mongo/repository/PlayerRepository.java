package com.esgi.cleancode.server.mongo.repository;

import java.util.UUID;

import com.esgi.cleancode.server.mongo.entity.PlayerEntity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<PlayerEntity, UUID> {}
