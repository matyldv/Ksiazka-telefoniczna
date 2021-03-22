package com.matylarekawek.exceptions;

public class InvalidKodPocztowyException extends Exception {
    public InvalidKodPocztowyException() {
    }

    public InvalidKodPocztowyException(String message) {
        super(message);
    }

    public InvalidKodPocztowyException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidKodPocztowyException(Throwable cause) {
        super(cause);
    }

    public InvalidKodPocztowyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
