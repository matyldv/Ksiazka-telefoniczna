package com.matylarekawek.exceptions;

public class InvalidNazwiskoException extends Exception {
    public InvalidNazwiskoException() {
    }

    public InvalidNazwiskoException(String message) {
        super(message);
    }

    public InvalidNazwiskoException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNazwiskoException(Throwable cause) {
        super(cause);
    }

    public InvalidNazwiskoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
