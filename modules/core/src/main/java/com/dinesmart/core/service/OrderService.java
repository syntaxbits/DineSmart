package com.dinesmart.core.service;

import com.dinesmart.core.exceptions.DineSmartException;
import com.dinesmart.core.model.entities.Order;
import com.dinesmart.core.model.entities.OrderStatus;
import com.dinesmart.core.model.entities.MenuItem;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Interface for managing restaurant orders.
 * This defines the contract for business logic related to orders.
 * Demonstrates:
 * - Interface definition.
 * - Use of `Optional` for methods that might not return a value.
 * - Custom `DineSmartException` for business logic errors.
 * - Generics in method signatures (List<Order>, Map<MenuItem, Integer>).
 */
public interface OrderService {

    /**
     * Creates a new order.
     * @param tableId The ID of the table placing the order.
     * @param items A map of menu items and their quantities.
     * @return The created Order object.
     * @throws DineSmartException if the order cannot be created (e.g., table not found, invalid items).
     */
    Order createOrder(int tableId, Map<MenuItem, Integer> items) throws DineSmartException;

    /**
     * Retrieves an order by its ID.
     * @param orderId The ID of the order.
     * @return An Optional containing the Order if found, or empty otherwise.
     */
    Optional<Order> getOrderById(int orderId);

    /**
     * Updates the status of an existing order.
     * @param orderId The ID of the order to update.
     * @param newStatus The new status for the order.
     * @return true if the order was updated successfully, false otherwise.
     * @throws DineSmartException if the order cannot be updated (e.g., invalid status transition).
     */
    boolean updateOrderStatus(int orderId, OrderStatus newStatus) throws DineSmartException;

    /**
     * Adds items to an existing order.
     * @param orderId The ID of the order to update.
     * @param itemsToAdd A map of menu items and quantities to add.
     * @return true if items were added successfully, false otherwise.
     * @throws DineSmartException if the order is not found or items cannot be added.
     */
    boolean addItemsToOrder(int orderId, Map<MenuItem, Integer> itemsToAdd) throws DineSmartException;

    /**
     * Retrieves all active (non-completed/non-cancelled) orders.
     * @return A list of active orders.
     */
    List<Order> getAllActiveOrders();

    /**
     * Deletes an order by its ID.
     * @param orderId The ID of the order to delete.
     * @return true if the order was deleted successfully, false otherwise.
     * @throws DineSmartException if the order cannot be deleted.
     */
    boolean deleteOrder(int orderId) throws DineSmartException;
}
