package com.dinesmart.core.model.entities;

/**
 * Represents the possible statuses of a restaurant order.
 * Demonstrates the use of a simple `enum`.
 */
public enum OrderStatus {
    PENDING,       // Order has been placed but not yet prepared
    PREPARING,     // Order is currently being prepared
    READY_FOR_SERVE, // Order is ready to be served to the customer
    SERVED,        // Order has been served
    PAID,          // Payment has been received for the order
    CANCELLED;     // Order has been cancelled
}
