package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class NextDayCalculatorTest {

    @Test
    public void testNextDay() {
        // Ngày 1 tháng 1 năm 2018
        String inputDate = "01-01-2018";
        String expectedNextDate = "02-01-2018";
        assertEquals(expectedNextDate, NextDayCalculator.findNextDay(inputDate));

        // Ngày 31 tháng 1 năm 2018
        inputDate = "31-01-2018";
        expectedNextDate = "01-02-2018";
        assertEquals(expectedNextDate, NextDayCalculator.findNextDay(inputDate));

        // Ngày 28 tháng 2 năm 2018 (năm nhuận)
        inputDate = "28-02-2018";
        expectedNextDate = "01-03-2018";
        assertEquals(expectedNextDate, NextDayCalculator.findNextDay(inputDate));

        // Ngày 29 tháng 2 năm 2020 (năm nhuận)
        inputDate = "29-02-2020";
        expectedNextDate = "01-03-2020";
        assertEquals(expectedNextDate, NextDayCalculator.findNextDay(inputDate));

        // Ngày 31 tháng 12 năm 2018
        inputDate = "31-12-2018";
        expectedNextDate = "01-01-2019";
        assertEquals(expectedNextDate, NextDayCalculator.findNextDay(inputDate));

    }

    @Test
    public void testInvalidDateFormat() {
        String inputDate = "2023-10-01"; // Định dạng không hợp lệ
        try {
            NextDayCalculator.findNextDay(inputDate);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid date format. Please use DD-MM-YYYY.", e.getMessage());
        }
    }
}