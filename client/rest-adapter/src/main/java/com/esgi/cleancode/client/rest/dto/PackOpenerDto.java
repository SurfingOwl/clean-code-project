package com.esgi.cleancode.client.rest.dto;

import com.esgi.cleancode.domain.functional.enums.PackEnum;
import com.fasterxml.jackson.annotation.JsonProperty;

public record PackOpenerDto(@JsonProperty("") PackEnum packRarity) {  }