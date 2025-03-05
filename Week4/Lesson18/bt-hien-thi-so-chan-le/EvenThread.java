public class EvenThread extends Thread {
    public void run() {
        System.out.println("EvenThread is running");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even Number: " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
