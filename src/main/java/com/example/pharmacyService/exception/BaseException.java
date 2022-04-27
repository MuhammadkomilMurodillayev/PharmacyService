package com.example.pharmacyService.exception;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;

public class BaseException extends RuntimeException {

    Timestamp time;
    String developerMessage;
    String path;

    public BaseException(String message) {
        super(message);
        this.time = new Timestamp(new Date().getTime());
        this.developerMessage = Arrays.toString(super.getStackTrace());
    }

    public BaseException(String message, String path) {
        this(message);
        this.path = path;
    }

}
