package com.esgi.cleancode.domain.functional.service;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Hero;
import com.esgi.cleancode.domain.functional.model.Pack;
import com.esgi.cleancode.domain.ports.client.PackOpenerApi;

import io.vavr.collection.List;
import io.vavr.control.Either;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PackOpenerService implements PackOpenerApi {

    @Override
    public Either<ApplicationError, List<Hero>> open(Pack pack) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
