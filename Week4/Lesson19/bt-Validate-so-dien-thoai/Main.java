import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số điện thoại: ");
        String phone = sc.nextLine();

        Pattern pattern = Pattern.compile("^[0-9]{2}-[0][0-9]{9}$");
        Matcher matcher = pattern.matcher(phone);

        if (matcher.matches()) {
            System.out.println("Số điện thoại " + phone + " hợp lệ");
        } else {
            System.out.println("Số điện thoại " + phone + " không hợp lệ");
        }
        sc.close();
    }
}
