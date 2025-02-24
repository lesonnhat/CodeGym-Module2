package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {

    // Hàm kiểm tra chuỗi Palindrome
    public static boolean isPalindrome(String str) {
        // Loại bỏ khoảng trắng và chuyển tất cả về chữ thường
        str = str.replaceAll("\\s+", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Đọc từng ký tự vào Queue và Stack
        for (char ch : str.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }

        // So sánh từng phần tử của Stack và Queue
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                return false; // Nếu khác nhau, không phải Palindrome
            }
        }

        return true; // Nếu tất cả đều giống nhau, là Palindrome
    }

    public static void main(String[] args) {
        String input = "Able was I ere I saw Elba";

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" là chuỗi Palindrome.");
        } else {
            System.out.println("\"" + input + "\" không phải là chuỗi Palindrome.");
        }
    }
}