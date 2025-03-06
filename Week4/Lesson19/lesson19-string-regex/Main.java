import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String str = "Hello World 25-09-1999. Hello VN 25/09/1999. MTP 1/1/1994";
//        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
//        Matcher matcher = pattern.matcher(str);
//
//        System.out.println("Ngày tháng trong chuỗi: " + str);
//
//        while (matcher.find()) {
//            System.out.println(str.substring(matcher.start(), matcher.end()));
//        }
//
//        String str2 = "2/12/2018";
//        String str3 = "2/12/19xx";
//
//        pattern = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$");
//
//        System.out.println("\nChuỗi " + str2 + " có định dạng ngày tháng: " + pattern.matcher(str2).matches());
//
//        System.out.println("\nChuỗi " + str3 + " có định dạng ngày tháng: " + pattern.matcher(str3).matches());

//        String text = "one,two,three";
//        String[] result = text.split(","); // ["one", "two", "three"]
//
//        System.out.println(result[0]);
//        System.out.println(result[1]);
//        System.out.println(result[2]);

        String text = "one,two,three,four";
        String[] result = text.split(",", 1); // ["one", "two,three,four"]
        System.out.println(Arrays.toString(result));

        boolean isEmpty = text.isEmpty();

        System.out.println("Java Java Java".replaceAll("v\\w", "wi"));

        System.out.println("Java Java Java".replaceFirst("v\\w", "wi"));
    }
}
