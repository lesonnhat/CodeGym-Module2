import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên lớp: ");

        String name = sc.nextLine();
        Pattern pattern = Pattern.compile("^[CAP][0-9]{4}[GHIK]$");
        Matcher matcher = pattern.matcher(name);

        if (matcher.matches()) {
            System.out.println("Tên lớp " + name + " hợp lệ");
        } else {
            System.out.println("Tên lớp " + name + " không hợp lệ");
        }
        sc.close();
    }
}
