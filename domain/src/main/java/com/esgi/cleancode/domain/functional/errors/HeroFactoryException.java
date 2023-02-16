package com.esgi.cleancode.domain.functional.errors;

public class HeroFactoryException extends Exception {
    
    public HeroFactoryException() {
        super();
    }

    public HeroFactoryException(String message) {
        super(message);
    }

    public HeroFactoryException(String message, Throwable throwable) {
        super(message);
    }
}
