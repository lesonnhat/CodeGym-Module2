public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread running...");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread Database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread Send Email");
        runnableDemo2.start();

        System.out.println("Main Thread Stopped!!!");
    }
}
