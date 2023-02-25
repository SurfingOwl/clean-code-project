package com.esgi.cleancode.client.rest.mapper;

import com.esgi.cleancode.client.rest.dto.PackOpenerDto;
import com.esgi.cleancode.client.rest.dto.PlayerDto;
import com.esgi.cleancode.domain.functional.model.Pack;
import com.esgi.cleancode.domain.functional.model.Player;

public interface PackDtoMapper {
    
    static Pack toDomain(PackOpenerDto packOpenerDto) {
        return null;
    }

    static PlayerDto toDto(Player player) {
        return null;
    }
}
