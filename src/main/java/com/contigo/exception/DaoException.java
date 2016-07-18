package com.contigo.exception;

/**
 * Created by nithin on 7/17/2016.
 */
public class DaoException extends RuntimeException {
    public  DaoException(Exception e) {
        super(e);
    }
}
