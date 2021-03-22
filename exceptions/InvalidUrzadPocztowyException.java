package com.matylarekawek.exceptions;

public class InvalidUrzadPocztowyException extends Exception {
    public InvalidUrzadPocztowyException() {
    }

    public InvalidUrzadPocztowyException(String message) {
        super(message);
    }

    public InvalidUrzadPocztowyException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidUrzadPocztowyException(Throwable cause) {
        super(cause);
    }

    public InvalidUrzadPocztowyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
