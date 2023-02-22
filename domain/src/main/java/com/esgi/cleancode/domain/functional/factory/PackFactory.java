package com.esgi.cleancode.domain.functional.factory;

import com.esgi.cleancode.domain.functional.enums.PackEnum;
import com.esgi.cleancode.domain.functional.model.DiamondPack;
import com.esgi.cleancode.domain.functional.model.Pack;
import com.esgi.cleancode.domain.functional.model.SilverPack;

public class PackFactory {
    
    static Pack buildPack(PackEnum pack) {
        switch(pack) {
            case DIAMOND:
                return DiamondPack.builder().build();
            case SILVER:
                return SilverPack.builder().build();
            default:
                return null; // TODO NOT CLEAN
        }
    }
}
