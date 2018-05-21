package com.akce.wallet.base;

/**
 * Created by Emre on 10.05.2018.
 */
public class CustomConstraintException extends RuntimeException {
    public CustomConstraintException(String message) {
        super(message);
    }
}