package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class NextDayCalculator {

    public static String findNextDay(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate;

        try {
            localDate = LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Please use DD-MM-YYYY.");
        }

        LocalDate nextDay = localDate.plusDays(1);
        return nextDay.format(formatter);
    }
}