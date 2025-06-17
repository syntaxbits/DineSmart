package com.dinesmart.util;

/**
 * Utility class for common validation checks.
 * Demonstrates:
 * - Basic null and empty string checks.
 */
public final class Validator { // 'final' to prevent inheritance, utility class pattern

    private Validator() {
        throw new AssertionError("Validator cannot be instantiated.");
    }

    /**
     * Checks if a string is null or empty.
     *
     * @param str The string to check.
     * @return true if the string is null or empty, false otherwise.
     */
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    /**
     * Checks if an object is null.
     *
     * @param obj The object to check.
     * @return true if the object is null, false otherwise.
     */
    public static boolean isNull(Object obj) {
        return obj == null;
    }

    /**
     * Checks if a number is positive.
     *
     * @param number The number to check.
     * @return true if the number is positive (greater than 0), false otherwise.
     */
    public static boolean isPositive(double number) {
        return number > 0;
    }
}
