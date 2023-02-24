package com.esgi.cleancode.domain.functional.service.validation;

import io.vavr.control.Validation;

import static io.vavr.API.Valid;
import static io.vavr.API.Invalid;

import com.esgi.cleancode.domain.ApplicationError;
import com.esgi.cleancode.domain.functional.model.Deck;
import com.esgi.cleancode.domain.functional.model.Pack;
import com.esgi.cleancode.domain.functional.model.Player;

public interface PlayerBalanceValidator {
    
    static Validation<ApplicationError, Deck> validate(Player player, Pack pack) {
        return player.getBalance() > pack.getPrice()
            ? Valid(player.getDeck())
            : Invalid(new ApplicationError("Balance Validator", "Balance inferior to pack price", player, null));
    }
}
