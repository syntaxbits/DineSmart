package com.dinesmart.core.model.entities;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import com.dinesmart.util.Validator; // Using Validator from util module

/**
 * A `record` representing a customer order, showcasing nested records and collections.
 * Demonstrates:
 * - Records within records (OrderItem).
 * - Use of `Map` for order items, `LocalDateTime` for timestamps.
 * - Validation in compact constructor.
 * - Defensive copying for mutable collections (`Map`).
 * - Generics with `Map<MenuItem, Integer>`.
 */
public record Order(
    int id,
    int tableId,
    LocalDateTime orderTime,
    Map<MenuItem, Integer> items, // MenuItem -> Quantity
    OrderStatus status,
    double totalAmount
) {
    // Compact constructor for validation and defensive copying
    public Order {
        if (id < 0) {
            throw new IllegalArgumentException("Order ID cannot be negative.");
        }
        if (tableId < 0) {
            throw new IllegalArgumentException("Table ID cannot be negative.");
        }
        if (Validator.isNull(orderTime)) {
            throw new IllegalArgumentException("Order time cannot be null.");
        }
        if (Validator.isNull(items) || items.isEmpty()) {
            throw new IllegalArgumentException("Order must contain items.");
        }
        if (Validator.isNull(status)) {
            throw new IllegalArgumentException("Order status cannot be null.");
        }
        if (!Validator.isPositive(totalAmount)) {
            throw new IllegalArgumentException("Total amount must be positive.");
        }

        // Defensive copy for the mutable map to ensure immutability of the record
        // This is crucial for records containing mutable components.
        items = Collections.unmodifiableMap(new HashMap<>(items));
    }

    // Method to calculate total amount, useful for consistency check
    public double calculateTotal() {
        return items.entrySet().stream()
                    .mapToDouble(entry -> entry.getKey().price() * entry.getValue())
                    .sum();
    }

    /**
     * Represents a single item within an order (e.g., 2 x Burger).
     * This can be an inner record or a separate record. For simplicity,
     * we are directly using Map<MenuItem, Integer> in the Order record.
     *
     * If we wanted a dedicated OrderItem record:
     * public record OrderItem(MenuItem item, int quantity) {
     * public OrderItem {
     * Objects.requireNonNull(item, "Order item cannot be null");
     * if (quantity <= 0) {
     * throw new IllegalArgumentException("Quantity must be positive.");
     * }
     * }
     * }
     * And then Order would have `List<OrderItem> items;`
     *
     * Sticking with `Map<MenuItem, Integer>` for simplicity in this example.
     */
}
