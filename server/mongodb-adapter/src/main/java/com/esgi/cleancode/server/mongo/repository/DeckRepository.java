package com.esgi.cleancode.server.mongo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esgi.cleancode.server.mongo.entity.DeckEntity;

public interface DeckRepository extends JpaRepository<DeckEntity, UUID> {}
