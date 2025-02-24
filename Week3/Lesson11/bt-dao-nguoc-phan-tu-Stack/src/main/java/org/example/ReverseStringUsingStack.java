package org.example;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Chuỗi ban đầu: " + input);

        String reversed = reverseString(input);
        System.out.println("Chuỗi sau khi đảo: " + reversed);
    }

    private static String reverseString(String input) {
        Stack<String> wStack = new Stack<>();

        // Tách từ và đưa vào Stack
        String[] words = input.split(" ");
        for (String word : words) {
            wStack.push(word);
        }

        // Đọc từ wStack và tạo chuỗi mới
        StringBuilder output = new StringBuilder();
        while (!wStack.isEmpty()) {
            output.append(wStack.pop());
            if (!wStack.isEmpty()) {
                output.append(" "); // Thêm khoảng trắng giữa các từ
            }
        }

        return output.toString();
    }
}