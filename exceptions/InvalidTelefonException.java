package com.matylarekawek.exceptions;

public class InvalidTelefonException extends Exception {
    public InvalidTelefonException() {
    }

    public InvalidTelefonException(String message) {
        super(message);
    }

    public InvalidTelefonException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidTelefonException(Throwable cause) {
        super(cause);
    }

    public InvalidTelefonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
