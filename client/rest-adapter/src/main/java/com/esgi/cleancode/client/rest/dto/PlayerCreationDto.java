package com.esgi.cleancode.client.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PlayerCreationDto(@JsonProperty("") String name) {  }
