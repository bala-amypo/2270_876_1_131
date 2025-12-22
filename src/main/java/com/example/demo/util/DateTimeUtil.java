package com.example.demo.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public final class DateTimeUtil {

    private static final ZoneId DEFAULT_ZONE = ZoneId.systemDefault();
    private static final DateTimeFormatter ISO_FORMATTER =
            DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    private DateTimeUtil() {
    }

    /**
     * @return current timestamp as Instant
     */
    public static Instant now() {
        return Instant.now();
    }

    
    public static LocalDateTime toLocalDateTime(Instant instant) {
        return LocalDateTime.ofInstant(instant, DEFAULT_ZONE);
    }

    
    public static Instant toInstant(LocalDateTime dateTime) {
        return dateTime.atZone(DEFAULT_ZONE).toInstant();
    }

    
    public static String formatInstant(Instant instant) {
        return ISO_FORMATTER.format(toLocalDateTime(instant));
    }

    
    public static Instant parseToInstant(String dateTime) {
        return toInstant(LocalDateTime.parse(dateTime, ISO_FORMATTER));
    }

    
    public static boolean isFuture(Instant instant) {
        return instant.isAfter(now());
    }

    public static boolean isValidRange(Instant start, Instant end) {
        return start != null && end != null && start.isBefore(end);
    }
}
