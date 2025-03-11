import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountryReader {
    public static void main(String[] args) {
        //TODO Mở File CSV
        String csvFile = "countries.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            System.out.println("DANH SÁCH QUỐC GIA:");
            while ((line = br.readLine()) != null) {
                // Phân tách dòng thành các trường
                String[] country = line.split(csvSplitBy);
                // In ra thông tin quốc gia
                System.out.println("ID: " + country[0] + ", Code: " + country[1] + ", Name: " + country[2]);
            }
        }
        catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc tệp: " + e.getMessage());
            e.printStackTrace();
        }


//        String csvFile = "countries.csv"; // Đường dẫn đến tệp CSV
//        String line;
//        String csvSplitBy = ",";
//
//        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//            System.out.println("Danh sách quốc gia:");
//            while ((line = br.readLine()) != null) {
//                // Phân tách dòng thành các trường
//                String[] country = line.split(csvSplitBy);
//                // In ra thông tin quốc gia
//                System.out.println("ID: " + country[0] + ", Code: " + country[1] + ", Name: " + country[2]);
//            }
//        } catch (IOException e) {
//            System.out.println("Đã xảy ra lỗi khi đọc tệp: " + e.getMessage());
//            e.printStackTrace();
//        }
    }
}