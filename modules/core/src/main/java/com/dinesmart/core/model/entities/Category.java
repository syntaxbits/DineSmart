package com.dinesmart.core.model.entities;

/**
 * A `sealed interface` defining the allowed categories for menu items.
 * Demonstrates:
 * - Java 17 `sealed interface` feature.
 * - Explicitly permits `FoodCategory` and `BeverageCategory` records.
 * - Encourages exhaustive pattern matching (e.g., with `switch` expressions on `Category` instances).
 */
public sealed interface Category permits FoodCategory, BeverageCategory {
    String name(); // Common method for all categories
}
