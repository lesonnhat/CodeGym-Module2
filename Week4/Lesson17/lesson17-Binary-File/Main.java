import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

//        // Nhập từng ký tự từ bàn phím và hiển thị kết quả lên màn hình
//        InputStream is = System.in;
//        while (true) {
//            System.out.print("Nhập 1 ký tự: ");
//            int ch = is.read();
//            if (ch == 'q') {
//                System.out.println("Finished!");
//                break;
//            }
//            is.skip(2); // Loại bỏ 2 ký tự \r và \n
//            System.out.println("Ký tự nhận được: " + (char) ch);
//        }

//        // Đọc nội dung của file sử dụng FileInputStream
//        // Tạo một đối tượng InputStream: Luồng đọc một file.
//        // File CodeGym.txt có chứa từ khóa: CodeGym
//        InputStream is = new FileInputStream("CodeGym.txt");
//
//        int i = -1;
//
//        // Đọc lần lượt các byte (8bit) trong luồng và lưu vào biến i
//        // Khi đọc ra giá trị -1 nghĩa là kết thúc luồng.
//        while ((i = is.read()) != -1) {
//            System.out.println((char) i);
//        }
//        is.close();

//        // Đọc nhiều byte sử dụng FileInputStream
//        // Tạo một luồng đầu vào bằng cách đọc một file
//        // File CodeGym.txt có chứa từ khóa: Hello InputStream
//        InputStream in = new FileInputStream("CodeGym.txt");
//
//        // Mảng để mỗi lần đọc các byte từ luồng thì tạm thời để lên đó
//        // Ta dùng mảng 10 byte
//
//        byte[] bytes = new byte[10];
//        int i = -1;
//
//        // Đọc các byte trong luồng và gán lên các phần tử của mảng.
//        // Giá trị i là số đọc được của 1 lần. (i sẽ <= 10).
//        // Khi không còn phần tử trong luồng i sẽ = -1
//        while ((i = in.read(bytes)) != -1) {
//            // Tạo String từ các byte đọc được
//            String s = new String(bytes, 0, i);
//            System.out.println(s);
//        }
//        in.close();

//        // Ghi nội dung ra file sử dụng FileOutputStream
//        // Tạo một luồng ký tự đầu ra với mục đích ghi thông tin vào file
//        OutputStream os = new FileOutputStream("output.txt");
//
//        // Tạo một mảng byte ,ta sẽ ghi các byte này vào file nói trên .
//        byte[] bytes = new byte[] { 'C', 'o', 'd', 'e', 'G', 'y', 'm' };
//
//        // Ghi lần lượt các ký tự vào luồng
//        for (int i = 0; i < bytes.length; i++) {
//            byte b = bytes[i];
//            // Ghi ký tự vào luồng
//            os.write(b);
//        }
//        // Đóng luồng đầu ra lại việc ghi xuống file hoàn tất.
//        os.close();

//        // Sử dụng O?
//
//        //  FileInputStream/FileOutputStream
//        try {
//            // Perform I/O operations
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}