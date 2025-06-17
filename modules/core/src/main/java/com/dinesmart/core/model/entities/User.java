package com.dinesmart.core.model.entities;

import com.dinesmart.util.Validator;

/**
 * A `record` representing a user in the system.
 * Demonstrates:
 * - Use of `record` for simple data encapsulation.
 * - Basic validation in compact constructor.
 */
public record User(
    int id,
    String username,
    String passwordHash, // Store hashed passwords, not plain text
    Role role
) {
    // Compact constructor for validation
    public User {
        if (id < 0) {
            throw new IllegalArgumentException("User ID cannot be negative.");
        }
        if (Validator.isNullOrEmpty(username)) {
            throw new IllegalArgumentException("Username cannot be null or empty.");
        }
        if (Validator.isNullOrEmpty(passwordHash)) {
            throw new IllegalArgumentException("Password hash cannot be null or empty.");
        }
        if (Validator.isNull(role)) {
            throw new IllegalArgumentException("User role cannot be null.");
        }
    }
}
