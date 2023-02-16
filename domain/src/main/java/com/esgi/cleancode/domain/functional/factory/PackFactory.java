package com.esgi.cleancode.domain.functional.factory;

import com.esgi.cleancode.domain.functional.enums.PackEnum;
import com.esgi.cleancode.domain.functional.errors.PackFactoryException;
import com.esgi.cleancode.domain.functional.model.DiamondPack;
import com.esgi.cleancode.domain.functional.model.Pack;
import com.esgi.cleancode.domain.functional.model.SilverPack;

public class PackFactory {
    
    static Pack buildPack(PackEnum pack) throws PackFactoryException {
        switch(pack) {
            case DIAMOND:
                return DiamondPack.builder().build();
            case SILVER:
                return SilverPack.builder().build();
            default:
                throw new PackFactoryException("PackEnum Exception");
        }
    }
}
