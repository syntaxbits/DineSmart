package com.dinesmart.core.model.entities;

/**
 * A `record` representing a dining table in the restaurant.
 * Demonstrates:
 * - Simpler data aggregation using records.
 * - Immutability by design.
 */
public record Table(
    int id,
    int capacity,
    boolean occupied,
    String currentOrderRef // Reference to an order, or null if unoccupied
) {
    // Compact constructor for validation
    public Table {
        if (id < 0) {
            throw new IllegalArgumentException("Table ID cannot be negative.");
        }
        if (capacity <= 0) {
            throw new IllegalArgumentException("Table capacity must be positive.");
        }
        // If occupied, currentOrderRef should not be null or empty
        if (occupied && (currentOrderRef == null || currentOrderRef.trim().isEmpty())) {
            throw new IllegalArgumentException("Occupied table must have a valid order reference.");
        }
        // If not occupied, currentOrderRef should be null
        if (!occupied && currentOrderRef != null && !currentOrderRef.trim().isEmpty()) {
            throw new IllegalArgumentException("Unoccupied table should not have an order reference.");
        }
    }
}
