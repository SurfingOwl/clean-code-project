package com.esgi.cleancode.domain.functional.errors;

public class PackFactoryException extends Exception {
    
    public PackFactoryException() {
        super();
    }

    public PackFactoryException(String message) {
        super(message);
    }
    
    public PackFactoryException(String message, Throwable throwable) {
        super(message);
    }
}
