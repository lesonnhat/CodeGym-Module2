public class OddThread extends Thread {
    public void run() {
        System.out.println("OddThread is running");
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd Number: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
