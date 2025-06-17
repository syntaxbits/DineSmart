package com.dinesmart.core.model.entities;

import com.dinesmart.util.Validator;

/**
 * A `record` representing a food category, implementing the `Category` sealed interface.
 * Demonstrates:
 * - Implementation of a `sealed interface` by a `record`.
 * - Compact constructor for validation.
 */
public record FoodCategory(int id, String name, boolean isVeganFriendly) implements Category {
    // Compact constructor for validation
    public FoodCategory {
        if (id < 0) {
            throw new IllegalArgumentException("Food Category ID cannot be negative.");
        }
        if (Validator.isNullOrEmpty(name)) {
            throw new IllegalArgumentException("Food Category name cannot be null or empty.");
        }
        // No specific validation for isVeganFriendly as it's a boolean
    }
}
