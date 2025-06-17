package com.dinesmart.core.model.entities;

import com.dinesmart.util.Validator;

/**
 * A `record` representing a beverage category, implementing the `Category` sealed interface.
 * Demonstrates:
 * - Implementation of a `sealed interface` by a `record`.
 * - Compact constructor for validation.
 */
public record BeverageCategory(int id, String name, boolean hasAlcohol) implements Category {
    // Compact constructor for validation
    public BeverageCategory {
        if (id < 0) {
            throw new IllegalArgumentException("Beverage Category ID cannot be negative.");
        }
        if (Validator.isNullOrEmpty(name)) {
            throw new IllegalArgumentException("Beverage Category name cannot be null or empty.");
        }
        // No specific validation for hasAlcohol as it's a boolean
    }
}
