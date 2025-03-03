import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        // Kiểm tra tham số đầu vào
        if (args.length < 2) {
            System.out.println("Vui lòng cung cấp tên tập tin nguồn và tập tin đích.");
            return;
        }

        String sourceFileName = args[0];
        String targetFileName = args[1];

        File sourceFile = new File(sourceFileName);
        File targetFile = new File(targetFileName);

        // Kiểm tra nếu tập tin nguồn tồn tại
        if (!sourceFile.exists()) {
            System.out.println("Tập tin nguồn không tồn tại: " + sourceFileName);
            return;
        }

        // Kiểm tra nếu tập tin đích đã tồn tại
        if (targetFile.exists()) {
            System.out.println("Tập tin đích đã tồn tại: " + targetFileName);
            return;
        }

        // Sao chép nội dung từ tập tin nguồn sang tập tin đích
        try (Reader reader = new FileReader(sourceFile);
             Writer writer = new FileWriter(targetFile)) {

            int character;
            int count = 0;

            while ((character = reader.read()) != -1) {
                writer.write(character);
                count++;
            }

            System.out.println("Sao chép thành công! Số ký tự đã sao chép: " + count);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi trong quá trình sao chép: " + e.getMessage());
        }
    }
}