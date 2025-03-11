package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        // Lỗi cú pháp
//        System.out.println("Hello, World!" // Thiếu dấu ngoặc đơn
//
//        // Lỗi khi chạy chương trình
//        int result = 10 / 0; // Chia cho 0 gây ra ArithmeticException
//        System.out.println(result);
//
//        // Lỗi logic
//        int a = 5, b = 10;
//        int sum = a - b; // Lỗi logic, nên là a + b
//        System.out.println("Sum: " + sum); // Kết quả không đúng

//        // Một chương trình chưa xử lý ngoại lệ
//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Nhập tử số: ");
//        int numerator = scanner.nextInt();
//        System.out.printf("Nhập mẫu số: ");
//        int denominator = scanner.nextInt();
//        int result = numerator/denominator;
//        System.out.printf("Kết quả: %d / %d = %d\n",numerator, denominator, result);

//        // Chương trình được xử lý ngoại lệ
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập tử số: ");
//        int numerator = scanner.nextInt(); // Giả định người dùng sẽ nhập đúng kiểu dữ liệu
//        System.out.print("Nhập mẫu số: ");
//        int denominator = scanner.nextInt(); // Giả định người dùng sẽ nhập đúng kiểu dữ liệu
//
//        try {
//            // Thực hiện phép chia
//            int result = numerator / denominator;
//            System.out.printf("Kết quả: %d / %d = %d\n", numerator, denominator, result);
//        } catch (ArithmeticException e) {
//            System.out.println("Lỗi: Không thể chia cho 0.");
//        } finally {
//            scanner.close(); // Đóng scanner
//        }

//        // Ví dụ ném ngoại lệ và né ngoại lệ
//        try {
//            // Gọi phương thức có thể ném ngoại lệ
//            int result = divide(10, 0);
//            System.out.println("Kết quả: " + result);
//        } catch (ArithmeticException e) {
//            // Né ngoại lệ: xử lý lỗi chia cho 0
//            System.out.println("Lỗi: " + e.getMessage());
//        }
//    }
//
//    // Phương thức thực hiện phép chia
//    public static int divide(int numerator, int denominator) {
//        // Ném ngoại lệ nếu mẫu số là 0
//        if (denominator == 0) {
//            throw new ArithmeticException("Không thể chia cho 0.");
//        }
//        return numerator / denominator; // Thực hiện phép chia
//

        try         {
            badMethod();
            System.out.print("A");
        }  catch (Exception ex)  {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    public static void badMethod(){
        throw new Error();
    }
}