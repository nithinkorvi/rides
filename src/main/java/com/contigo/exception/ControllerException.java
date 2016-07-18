package com.contigo.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by nithin on 7/17/2016.
 */
public class ControllerException extends RuntimeException {
    public ControllerException(Exception e) {
        super(e);
    }

    public ControllerException(HttpStatus status, String message) {
        super(message);
    }
}
