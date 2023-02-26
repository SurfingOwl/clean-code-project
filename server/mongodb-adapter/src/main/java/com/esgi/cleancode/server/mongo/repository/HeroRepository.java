package com.esgi.cleancode.server.mongo.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.esgi.cleancode.server.mongo.entity.HeroEntity;

public interface HeroRepository extends MongoRepository<HeroEntity, UUID> {}
