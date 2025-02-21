package org.example;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzTranslate {

    private static final Map<Integer, String> numberWords = new HashMap<>();

    static {
        numberWords.put(1, "một");
        numberWords.put(2, "hai");
        numberWords.put(3, "ba");
        numberWords.put(4, "bốn");
        numberWords.put(5, "năm");
        numberWords.put(6, "sáu");
        numberWords.put(7, "bảy");
        numberWords.put(8, "tám");
        numberWords.put(9, "chín");
        numberWords.put(10, "mười");
        // Thêm từ đọc cho các số từ 11 đến 99
        for (int i = 11; i < 100; i++) {
            numberWords.put(i, convertToWords(i));
        }
    }

    public String translate(int number) {
        if (number <= 0 || number >= 100) {
            throw new IllegalArgumentException("Số phải lớn hơn 0 và nhỏ hơn 100");
        }

        String result = "";

        if (number % 3 == 0 || String.valueOf(number).contains("3")) {
            result += "Fizz";
        }
        if (number % 5 == 0 || String.valueOf(number).contains("5")) {
            result += "Buzz";
        }

        if (result.isEmpty()) {
            return numberWords.get(number);
        }

        return result;
    }

    private static String convertToWords(int number) {
        if (number < 20) {
            return numberWords.get(number);
        } else {
            int tens = number / 10;
            int units = number % 10;
            String result = "";

            switch (tens) {
                case 2: result += "hai mươi"; break;
                case 3: result += "ba mươi"; break;
                case 4: result += "bốn mươi"; break;
                case 5: result += "năm mươi"; break;
                case 6: result += "sáu mươi"; break;
                case 7: result += "bảy mươi"; break;
                case 8: result += "tám mươi"; break;
                case 9: result += "chín mươi"; break;
            }

            if (units > 0) {
                result += " " + numberWords.get(units);
            }

            return result.trim();
        }
    }
}