package org.example;

import java.util.Stack;

public class BracketChecker {

    // Hàm kiểm tra tính hợp lệ của dấu ngoặc
    public static boolean isValidExpression(String expression) {
        Stack<Character> bStack = new Stack<>();

        for (char sym : expression.toCharArray()) {
            // Nếu gặp dấu ngoặc trái
            if (sym == '(' || sym == '{' || sym == '[') {
                bStack.push(sym);
            }
            // Nếu gặp dấu ngoặc phải
            else if (sym == ')' || sym == '}' || sym == ']') {
                // Nếu Stack rỗng, không có dấu ngoặc trái tương ứng
                if (bStack.isEmpty()) {
                    return false;
                }
                // Lấy dấu ngoặc trái ở đỉnh Stack
                char left = bStack.pop();
                // Kiểm tra xem có khớp không
                if (!isMatchingPair(left, sym)) {
                    return false;
                }
            }
        }

        // Nếu Stack rỗng, tất cả các dấu ngoặc đã khớp, ngược lại là không hợp lệ
        return bStack.isEmpty();
    }

    // Hàm kiểm tra xem hai dấu ngoặc có khớp nhau không
    private static boolean isMatchingPair(char left, char right) {
        return (left == '(' && right == ')') ||
                (left == '{' && right == '}') ||
                (left == '[' && right == ']');
    }

    public static void main(String[] args) {
        String[] expressions = {
                "s * (s – a) * (s – b) * (s – c)", // Well
                "(– b + (b2 – 4*a*c)^0.5) / 2*a", // Well
                "s * (s – a) * (s – b * (s – c)", // ???
                "s * (s – a) * s – b) * (s – c)", // ???
                "(– b + (b^2 – 4*a*c)^(0.5/ 2*a)" // ???
        };

        for (String expr : expressions) {
            System.out.println("Biểu thức: " + expr);
            if (isValidExpression(expr)) {
                System.out.println("→ Hợp lệ");
            } else {
                System.out.println("→ Không hợp lệ");
            }
        }
    }
}