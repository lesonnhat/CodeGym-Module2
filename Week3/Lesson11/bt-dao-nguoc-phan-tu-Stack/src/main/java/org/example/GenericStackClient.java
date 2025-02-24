package org.example;

import java.util.Stack;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Triển khai mảng Integers");
        stackOfIntegers();
        System.out.println();

//        System.out.println("2. Triển khai chuỗi Strings");
//        stackOfString();

        System.out.println("2. Triển khai chuỗi Strings");
        String input = "Tôi người Hải Dương";
        System.out.println(" 2.1. Chuỗi ban đầu: " + input);
        String reversed = reverseString(input);
        System.out.println(" 2.2. Chuỗi sau khi đảo: " + reversed);
    }

    private static void stackOfIntegers() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(" 1.1. Mảng ban đầu:\n     " + stack);

        Stack<Integer> tempStack = new Stack<Integer>();
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        stack = tempStack;
        System.out.println(" 1.2. Mảng sau khi đảo:\n     " + stack);

    }

//    private static void stackOfString() {
//        Stack<String> stack2 = new Stack<String>();
//        stack2.push("tôi");
//        stack2.push("người");
//        stack2.push("Hải");
//        stack2.push("Dương");
//
//        System.out.println(" 2.1. Chuỗi ban đầu:\n     " + stack2);
//
//        Stack<String> tempStack2 = new Stack<String>();
//        while (!stack2.isEmpty()) {
//            tempStack2.push(stack2.pop());
//        }
//        stack2 = tempStack2;
//        System.out.println(" 2.2. Chuỗi sau khi đảo:\n     " + stack2);
//    }

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
