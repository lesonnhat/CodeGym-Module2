package org.example;

import java.util.Stack;

public class NumberConversion {

    // Chuyển từ thập phân sang nhị phân
    public static String decimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();

        while (decimal > 0) {
            stack.push(decimal % 2); // Thêm dư vào Stack
            decimal /= 2; // Chia cho 2
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop()); // Lấy giá trị từ Stack
        }

        return binary.toString();
    }

    // Chuyển từ thập phân sang hệ 16
    public static String decimalToHexadecimal(int decimal) {
        Stack<Character> stack = new Stack<>();

        while (decimal > 0) {
            int remainder = decimal % 16; // Lấy dư
            if (remainder < 10) {
                stack.push((char) (remainder + '0')); // Thêm số
            } else {
                stack.push((char) (remainder - 10 + 'A')); // Thêm chữ cái
            }
            decimal /= 16; // Chia cho 16
        }

        StringBuilder hexadecimal = new StringBuilder();
        while (!stack.isEmpty()) {
            hexadecimal.append(stack.pop()); // Lấy giá trị từ Stack
        }

        return hexadecimal.toString();
    }

    // Chuyển từ nhị phân sang thập phân
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0'); // Tính giá trị thập phân
        }
        return decimal;
    }

    // Chuyển từ hệ 16 sang thập phân
    public static int hexadecimalToDecimal(String hexadecimal) {
        int decimal = 0;
        for (int i = 0; i < hexadecimal.length(); i++) {
            char ch = hexadecimal.charAt(i);
            int value;
            if (ch >= '0' && ch <= '9') {
                value = ch - '0'; // Tính giá trị
            } else {
                value = ch - 'A' + 10; // Tính giá trị cho A-F
            }
            decimal = decimal * 16 + value; // Tính giá trị thập phân
        }
        return decimal;
    }

    public static void main(String[] args) {
        int decimalNumber = 30;

        // Chuyển đổi từ thập phân sang nhị phân
        String binary = decimalToBinary(decimalNumber);
        System.out.println("Thập phân " + decimalNumber + " sang nhị phân: " + binary);

        // Chuyển đổi từ thập phân sang hệ 16
        String hexadecimal = decimalToHexadecimal(decimalNumber);
        System.out.println("Thập phân " + decimalNumber + " sang hệ 16: " + hexadecimal);

        // Chuyển đổi từ nhị phân sang thập phân
        String binaryNumber = "11110";
        int decimalFromBinary = binaryToDecimal(binaryNumber);
        System.out.println("Nhị phân " + binaryNumber + " sang thập phân: " + decimalFromBinary);

        // Chuyển đổi từ hệ 16 sang thập phân
        String hexNumber = "1E";
        int decimalFromHex = hexadecimalToDecimal(hexNumber);
        System.out.println("Hệ 16 " + hexNumber + " sang thập phân: " + decimalFromHex);
    }
}