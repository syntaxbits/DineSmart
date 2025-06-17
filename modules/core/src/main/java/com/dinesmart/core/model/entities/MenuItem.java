package com.dinesmart.core.model.entities;

import com.dinesmart.util.Validator;

/**
 * A `record` representing a single menu item in the restaurant.
 * Demonstrates:
 * - Java 17 `record` feature for immutable data carriers.
 * - Compact constructor for validation.
 * - Overrides of `equals()`, `hashCode()`, `toString()` are automatically generated.
 */
public record MenuItem(
    int id,
    String name,
    String description,
    double price,
    Category category, // Using our sealed interface for category
    boolean available
) {
    // Compact constructor for validation, executed after canonical constructor
    public MenuItem {
        if (id < 0) {
            throw new IllegalArgumentException("Menu Item ID cannot be negative.");
        }
        if (Validator.isNullOrEmpty(name)) {
            throw new IllegalArgumentException("Menu Item name cannot be null or empty.");
        }
        if (!Validator.isPositive(price)) {
            throw new IllegalArgumentException("Menu Item price must be positive.");
        }
        if (Validator.isNull(category)) {
            throw new IllegalArgumentException("Menu Item category cannot be null.");
        }
    }
}
