package com.dinesmart.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Optional;

/**
 * Utility class for handling date and time operations, especially for localization.
 * Demonstrates:
 * - `java.time` API (LocalDateTime, ZonedDateTime, ZoneId)
 * - `DateTimeFormatter` for localized date/time formatting
 * - `Locale` for internationalization
 * - `Optional` for safe return of potentially null values.
 */
public final class DateUtil { // 'final' to prevent inheritance, utility class pattern

    // Private constructor to prevent instantiation for a utility class
    private DateUtil() {
        throw new AssertionError("DateUtil cannot be instantiated.");
    }

    /**
     * Formats the current local date and time based on the user's default locale and timezone.
     *
     * @return A formatted string of the current date and time.
     */
    public static String formatCurrentDateTime() {
        // Get the current date and time in the system default timezone
        ZonedDateTime now = ZonedDateTime.now(ZoneId.systemDefault());

        // Use FormatStyle.LONG for a more complete date and time format
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

        return now.format(formatter);
    }

    /**
     * Formats a given LocalDateTime for a specific locale and zone.
     *
     * @param dateTime The LocalDateTime to format.
     * @param locale   The Locale to use for formatting.
     * @param zoneId   The ZoneId to convert the LocalDateTime to for display.
     * @return An Optional containing the formatted string, or empty if dateTime is null.
     * Demonstrates `Optional` for handling potential null inputs safely.
     */
    public static Optional<String> formatDateTime(LocalDateTime dateTime, Locale locale, ZoneId zoneId) {
        if (dateTime == null || locale == null || zoneId == null) {
            return Optional.empty(); // Return empty Optional for invalid inputs
        }

        // Convert LocalDateTime to ZonedDateTime in the specified zone
        ZonedDateTime zonedDateTime = dateTime.atZone(zoneId);

        // Create a localized formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                                                .withLocale(locale);

        return Optional.of(zonedDateTime.format(formatter));
    }

    /**
     * Returns the current system default ZoneId.
     *
     * @return The default ZoneId.
     */
    public static ZoneId getDefaultZoneId() {
        return ZoneId.systemDefault();
    }

    /**
     * Parses a date string into a LocalDateTime using a default format.
     * Demonstrates basic exception handling for parsing.
     *
     * @param dateString The date string to parse.
     * @return An Optional containing the parsed LocalDateTime, or empty if parsing fails.
     */
    public static Optional<LocalDateTime> parseDateTime(String dateString) {
        // Define a common format, or accept a formatter as a parameter for more flexibility
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME; // e.g., "yyyy-MM-ddTHH:mm:ss"
        try {
            return Optional.of(LocalDateTime.parse(dateString, formatter));
        } catch (java.time.format.DateTimeParseException e) {
            System.err.println("Error parsing date: " + dateString + " - " + e.getMessage());
            return Optional.empty();
        }
    }
}
