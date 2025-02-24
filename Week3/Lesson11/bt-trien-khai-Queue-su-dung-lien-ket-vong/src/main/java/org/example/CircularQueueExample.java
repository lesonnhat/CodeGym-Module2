package org.example;

public class CircularQueueExample {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        System.out.println("Hàng đợi hiện tại:");
        queue.displayQueue(); // Hiển thị hàng đợi

        System.out.println("Lấy ra phần tử: " + queue.deQueue());
        System.out.println("Hàng đợi sau khi lấy ra phần tử:");
        queue.displayQueue(); // Hiển thị hàng đợi sau khi dequeue
    }
}