package com.dinesmart.core.exceptions;

/**
 * Custom exception for the DineSmart application.
 * This demonstrates:
 * - Creation of a custom checked exception (extends `Exception`).
 * - Multiple constructors to provide flexibility in conveying error messages and cause.
 */
public class DineSmartException extends Exception {

    /**
     * Constructs a new DineSmartException with no detail message.
     */
    public DineSmartException() {
        super();
    }

    /**
     * Constructs a new DineSmartException with the specified detail message.
     * @param message The detail message.
     */
    public DineSmartException(String message) {
        super(message);
    }

    /**
     * Constructs a new DineSmartException with the specified detail message and cause.
     * @param message The detail message.
     * @param cause The cause (which is saved for later retrieval by the `getCause()` method).
     */
    public DineSmartException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new DineSmartException with the specified cause and a detail message of
     * (cause==null ? null : cause.toString()) (which typically contains the class and detail message of cause).
     * @param cause The cause (which is saved for later retrieval by the `getCause()` method).
     */
    public DineSmartException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new DineSmartException with the specified detail message, cause,
     * suppression enabled or disabled, and writable stack trace enabled or disabled.
     *
     * @param message            The detail message.
     * @param cause              The cause.
     * @param enableSuppression  Whether or not suppression is enabled or disabled.
     * @param writableStackTrace Whether or not the stack trace should be writable.
     */
    protected DineSmartException(String message, Throwable cause,
                               boolean enableSuppression,
                               boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
