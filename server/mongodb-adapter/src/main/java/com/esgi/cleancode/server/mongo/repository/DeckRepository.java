package com.esgi.cleancode.server.mongo.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.esgi.cleancode.server.mongo.entity.DeckEntity;
public interface DeckRepository extends MongoRepository<DeckEntity, UUID> {}
