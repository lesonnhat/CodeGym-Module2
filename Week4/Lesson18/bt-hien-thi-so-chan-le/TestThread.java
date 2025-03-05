public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();

        try {
            oddThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        evenThread.start();

        try {
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Both threads have finished.");
    }
}
