import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFileClass {

    public static void main(String[] args) throws FileNotFoundException {
//        // Lớp File
//        java.io.File file = new java.io.File("image/us.gif");
//
//        System.out.println("Does it exist? " + file.exists());
//        System.out.println("The file has " + file.length() + " bytes");
//        System.out.println("Can it be read? " + file.canRead());
//        System.out.println("Can it be written? " + file.canWrite());
//        System.out.println("Is it a directory? " + file.isDirectory());
//        System.out.println("Is it a file? " + file.isFile());
//        System.out.println("Is it absolute? " + file.isAbsolute());
//        System.out.println("Is it hidden? " + file.isHidden());
//        System.out.println("Absolute path is " + file.getAbsolutePath());
//        System.out.println("Last modified on " + new java.util.Date(file.lastModified()));

//        // Lớp File trong gói java.io
//        File f = new File("foo.txt");
//
//        File dir = new File("Books");
//        dir.mkdir();
//
//        if (dir.isDirectory()) {
//            String[] dirContents = dir.list();
//            for (int i = 0; i < dirContents.length; i++)
//                System.out.println(dirContents[i]);
//        }
//
//        System.out.println(dir.getAbsolutePath());
//
//        boolean isDeleted = f.delete();

        // Scanner hoạt động
        try {
            Scanner input = new Scanner(new File("test.txt"));

            int intValue = input.nextInt();    // Đọc số nguyên đầu tiên
            String line = input.nextLine();     // Đọc phần còn lại của dòng

            System.out.println("Giá trị đọc được: " + intValue);
            System.out.println("Phần còn lại của dòng: " + line);

            input.close(); // Đóng scanner
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}