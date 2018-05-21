package com.akce.wallet.base;

/**
 * Created by Emre on 10.05.2018.
 */
public class CustomServiceException extends RuntimeException {
    public CustomServiceException(String message) {
        super(message);
    }
}
