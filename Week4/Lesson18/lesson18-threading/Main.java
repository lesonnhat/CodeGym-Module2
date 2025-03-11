public class Main extends Thread {
    public static void main(String[] args) {
        // Khai báo một đối tượng t tham chiếu đến Thread hiện tại
        Thread t = Thread.currentThread();

        // Lấy ra tên Main Thread
        System.out.println("Thread hiện tại: " + t.getName());

        // Đổi trn Main Thread
        t.setName("CodeGym");
        System.out.println("Thread sau khi đổi tên: " + t.getName());

        // Lấy ra độ ưu tiên của Main Thread
        System.out.println("Độ ưu tiên của Main Thread: " + t.getPriority());

        // Cài đặt độ ưu tiên cho Main Thread
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Độ ưu tiên mới của Main Thread: " + t.getPriority());

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }

        // Main Thread tạo ra một Thread con
        ChildThread ct = new ChildThread();

        // Cài đặt độ ưu tiên cho Thread con
        System.out.println("Độ ưu tiên của ChildThread: " + ct.getPriority());

        // Cài đặt độ ưu tiên cho Thread con
        ct.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Độ ưu tiên mới của ChildThread: " + ct.getPriority());

        ct.start();
    }
}
