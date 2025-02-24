package org.example;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        // Nhập văn bản từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập văn bản: ");
        String text = scanner.nextLine();

        // Gọi phương thức để đếm từ
        Map<String, Integer> wordCountMap = countWords(text);

        // Hiển thị kết quả
        System.out.println("\nSố lần xuất hiện của các từ:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    private static Map<String, Integer> countWords(String text) {
        // Sử dụng TreeMap để lưu trữ từ và số lần xuất hiện
        Map<String, Integer> wordCountMap = new TreeMap<>();

        // Tách từ và duyệt qua từng từ
        String[] words = text.split("\\W+"); // Tách bằng bất kỳ ký tự không phải từ

        for (String word : words) {
            // Chuyển toàn bộ thành chữ thường
            word = word.toLowerCase();

            // Kiểm tra xem từ đã có trong map chưa
            if (wordCountMap.containsKey(word)) {
                // Nếu có, tăng giá trị lên 1
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // Nếu chưa có, thêm vào map với giá trị 1
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }
}