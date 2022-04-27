package com.example.pharmacyService.exception;

public class NullElementException extends BaseException {

    public NullElementException(String message) {
        super(message);
    }

    public NullElementException(String message, String path) {
        super(message, path);
    }
}
