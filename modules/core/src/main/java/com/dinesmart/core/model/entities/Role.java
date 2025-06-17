package com.dinesmart.core.model.entities;

/**
 * Represents the roles a user can have in the DineSmart application.
 * Demonstrates the use of a simple `enum`.
 */
public enum Role {
    ADMIN,      // Full administrative access
    MANAGER,    // Management-level access
    STAFF,      // General staff access (e.g., taking orders)
    GUEST;      // Limited access (e.g., viewing menu, but no orders)
}
