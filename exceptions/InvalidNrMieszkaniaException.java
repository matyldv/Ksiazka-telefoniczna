package com.matylarekawek.exceptions;

public class InvalidNrMieszkaniaException extends Exception {
    public InvalidNrMieszkaniaException() {
    }

    public InvalidNrMieszkaniaException(String message) {
        super(message);
    }

    public InvalidNrMieszkaniaException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNrMieszkaniaException(Throwable cause) {
        super(cause);
    }

    public InvalidNrMieszkaniaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
