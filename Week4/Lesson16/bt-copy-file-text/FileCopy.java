import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        //TODO Bước 1
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tệp nguồn: ");
        String sourceFile = sc.nextLine();

        System.out.println("Nhập tệp đích: ");
        String targetFile = sc.nextLine();

        //TODO Bước 2
        File source = new File(sourceFile);
        if (!source.exists()) {
            System.out.println("Tệp nguồn không hợp lệ hoặc không tồn tại");
            return;
        }
        File target = new File(targetFile);
        if (target.exists()) {
            System.out.println("Xảy ra lỗi. Tệp đích đã tồn tại");
            return;
        }

        //TODO Bước 3
        try (FileReader fileReader = new FileReader(source);
             FileWriter fileWriter = new FileWriter(target)) {
            int character;
            int count = 0;

            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
                count++;
            }
            System.out.println("Sao chép thành công. Số ký tự đã sao chép: " + count);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Nhập vào tệp nguồn: ");
//        String sourceFile = sc.nextLine();
//
//        System.out.println("Nhập vào tệp đích: ");
//        String targetFile = sc.nextLine();
//
//        File source = new File(sourceFile);
//        if (!source.exists()) {
//            System.out.println("Địa chỉ tệp nguồn chưa đúng hoặc không tồn tại.");
//            return; // Ngừng chương trình nếu tệp nguồn không tồn tại
//        }
//
//        File target = new File(targetFile);
//        if (target.exists()) {
//            System.out.println("Xảy ra lỗi! Tệp đích đã tồn tại.");
//            return; // Ngừng chương trình nếu tệp đích đã tồn tại
//        }
//
//        try (FileReader fileReader = new FileReader(source);
//             FileWriter fileWriter = new FileWriter(target)) {
//            int character;
//            int count = 0;
//
//            while ((character = fileReader.read()) != -1) {
//                fileWriter.write(character);
//                count++;
//            }
//            System.out.println("Sao chép thành công! Số ký tự đã sao chép: " + count);
//            System.out.println("Số ký tự đã sao chép: " + count);
//        }
//        catch (IOException e) {
//            System.out.println("Đã xảy ra lỗi I/O: " + e.getMessage());
//            e.printStackTrace();
//        }
//
//        sc.close();
//    }


//        Scanner scanner = new Scanner(System.in);
//
//        // Nhập đường dẫn tệp nguồn
//        System.out.print("Nhập đường dẫn tệp nguồn: ");
//        String sourceFile = scanner.nextLine();
//
//        // Nhập đường dẫn tệp đích
//        System.out.print("Nhập đường dẫn tệp đích: ");
//        String targetFile = scanner.nextLine();
//
//        // Kiểm tra tệp nguồn có tồn tại không
//        File source = new File(sourceFile);
//        if (!source.exists()) {
//            System.out.println("Tệp nguồn không tồn tại!");
//            return;
//        }
//
//        // Kiểm tra tệp đích đã tồn tại chưa
//        File target = new File(targetFile);
//        if (target.exists()) {
//            System.out.println("Tệp đích đã tồn tại!");
//            return;
//        }
//
//        // Thực hiện sao chép
//        try (FileReader fileReader = new FileReader(source);
//             FileWriter fileWriter = new FileWriter(target)) {
//
//            int character;
//            int count = 0;
//
//            while ((character = fileReader.read()) != -1) {
//                fileWriter.write(character);
//                count++;
//            }
//
//            System.out.println("Sao chép thành công! Số ký tự đã sao chép: " + count);
//        } catch (IOException e) {
//            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
}