public class EmailExampleTest {
    private static EmailExample emailExample = new EmailExample();
    public static final String[] valIdEmails = new String[]{"hanoi@gmail.com", "nhat34@101tv.com", "134@vtv.vn"};
    public static final String[] invalIdEmails = new String[]{"@gmail.com", "nhat34@101tv.", "@#xuso@vtv.vn"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : valIdEmails) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + ". Is valid? " + isValid);
        }
        for (String email : invalIdEmails) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + ". Is valid? " + isValid);
        }
    }

}
