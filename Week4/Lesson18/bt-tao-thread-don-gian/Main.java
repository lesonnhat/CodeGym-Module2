public class Main {
    public static void main(String[] args) {
        NumberGenerator number1 = new NumberGenerator();
        NumberGenerator number2 = new NumberGenerator();

        Thread thread1 = new Thread(number1);
        Thread thread2 = new Thread(number2);

        // Thay đổi priority
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Starting thread...");
        thread1.start();
        thread2.start();
    }
}
