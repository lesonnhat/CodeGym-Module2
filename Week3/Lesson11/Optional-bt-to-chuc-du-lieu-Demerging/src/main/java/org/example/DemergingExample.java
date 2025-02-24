package org.example;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class DemergingExample {
    public static void main(String[] args) {
        // Giả lập đọc dữ liệu từ file
        Queue<Record> recordsQueue = new LinkedList<>();
        recordsQueue.add(new Record("Alice", "NU", "1990-05-15"));
        recordsQueue.add(new Record("Bob", "NAM", "1989-03-22"));
        recordsQueue.add(new Record("Catherine", "NU", "1992-01-30"));
        recordsQueue.add(new Record("David", "NAM", "1988-07-12"));

        // Tạo hai queue rỗng cho nữ và nam
        Queue<Record> femaleQueue = new LinkedList<>();
        Queue<Record> maleQueue = new LinkedList<>();

        // Phân loại bản ghi vào queue nữ và nam
        while (!recordsQueue.isEmpty()) {
            Record record = recordsQueue.poll();
            if (record.gender.equals("NU")) {
                femaleQueue.add(record);
            } else {
                maleQueue.add(record);
            }
        }

        // Ghi dữ liệu vào file output
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            // Ghi các bản ghi nữ
            while (!femaleQueue.isEmpty()) {
                writer.write(femaleQueue.poll().toString());
                writer.newLine();
            }
            // Ghi các bản ghi nam
            while (!maleQueue.isEmpty()) {
                writer.write(maleQueue.poll().toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Dữ liệu đã được tổ chức và ghi vào file output.txt.");
    }
}
