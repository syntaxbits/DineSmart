package com.dinesmart.core.service;

import com.dinesmart.core.exceptions.DineSmartException;
import com.dinesmart.core.model.entities.Category;
import com.dinesmart.core.model.entities.MenuItem;

import java.util.List;
import java.util.Optional;
import java.util.Set; // Demonstrating Set usage

/**
 * Interface for managing menu items.
 * Demonstrates:
 * - Interface definition.
 * - Use of `Optional` for methods that might not return a value.
 * - Custom `DineSmartException`.
 * - Generics (List<MenuItem>, Set<Category>).
 */
public interface MenuItemService {

    /**
     * Adds a new menu item.
     * @param name The name of the menu item.
     * @param description The description of the menu item.
     * @param price The price of the menu item.
     * @param category The category of the menu item.
     * @param available Whether the item is currently available.
     * @return The created MenuItem object.
     * @throws DineSmartException if the item cannot be added (e.g., name conflict).
     */
    MenuItem addMenuItem(String name, String description, double price, Category category, boolean available) throws DineSmartException;

    /**
     * Retrieves a menu item by its ID.
     * @param itemId The ID of the menu item.
     * @return An Optional containing the MenuItem if found, or empty otherwise.
     */
    Optional<MenuItem> getMenuItemById(int itemId);

    /**
     * Retrieves a menu item by its name.
     * @param name The name of the menu item.
     * @return An Optional containing the MenuItem if found, or empty otherwise.
     */
    Optional<MenuItem> getMenuItemByName(String name);

    /**
     * Updates an existing menu item.
     * @param updatedMenuItem The MenuItem object with updated details.
     * @return true if the item was updated successfully, false otherwise.
     * @throws DineSmartException if the item is not found or update fails.
     */
    boolean updateMenuItem(MenuItem updatedMenuItem) throws DineSmartException;

    /**
     * Deletes a menu item by its ID.
     * @param itemId The ID of the menu item to delete.
     * @return true if the item was deleted successfully, false otherwise.
     * @throws DineSmartException if the item cannot be deleted (e.g., it's part of an active order).
     */
    boolean deleteMenuItem(int itemId) throws DineSmartException;

    /**
     * Retrieves all menu items.
     * @return A list of all menu items.
     */
    List<MenuItem> getAllMenuItems();

    /**
     * Retrieves menu items by category.
     * @param category The category to filter by.
     * @return A list of menu items belonging to the specified category.
     */
    List<MenuItem> getMenuItemsByCategory(Category category);

    /**
     * Retrieves all distinct categories.
     * @return A set of all distinct categories available.
     */
    Set<Category> getAllCategories();
}
