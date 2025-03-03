import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập đường dẫn tệp nguồn
        System.out.print("Nhập đường dẫn tệp nguồn: ");
        String sourceFile = scanner.nextLine();

        // Nhập đường dẫn tệp đích
        System.out.print("Nhập đường dẫn tệp đích: ");
        String targetFile = scanner.nextLine();

        // Kiểm tra tệp nguồn có tồn tại không
        File source = new File(sourceFile);
        if (!source.exists()) {
            System.out.println("Tệp nguồn không tồn tại!");
            return;
        }

        // Kiểm tra tệp đích đã tồn tại chưa
        File target = new File(targetFile);
        if (target.exists()) {
            System.out.println("Tệp đích đã tồn tại!");
            return;
        }

        // Thực hiện sao chép
        try (FileReader fileReader = new FileReader(source);
             FileWriter fileWriter = new FileWriter(target)) {

            int character;
            int count = 0;

            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
                count++;
            }

            System.out.println("Sao chép thành công! Số ký tự đã sao chép: " + count);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}