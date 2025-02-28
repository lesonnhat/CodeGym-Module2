package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideA = 0, sideB = 0, sideC = 0;

        // Nhập liệu
        System.out.print("Nhập cạnh a: ");
        sideA = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        sideB = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        sideC = scanner.nextDouble();

        try {
            // Kiểm tra tính hợp lệ của tam giác
            checkTriangleValidity(sideA, sideB, sideC);
            System.out.println("Tam giác hợp lệ với các cạnh: a = " + sideA + ", b = " + sideB + ", c = " + sideC);
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập số hợp lệ.");
        } finally {
            scanner.close();
        }
    }

    public static void checkTriangleValidity(double sideA, double sideB, double sideC) throws IllegalTriangleException {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalTriangleException("Cạnh tam giác không được là số âm hoặc bằng 0.");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalTriangleException("Cạnh không tạo thành một tam giác hợp lệ.");
        }
    }
}