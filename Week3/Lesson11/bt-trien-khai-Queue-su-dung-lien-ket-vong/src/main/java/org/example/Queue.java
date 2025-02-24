package org.example;

class Queue {
    private Node front; // Phần tử đầu
    private Node rear;  // Phần tử cuối

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    // Hàm thêm phần tử vào hàng đợi
    public void enQueue(int value) {
        Node newNode = new Node(value);

        if (front == null) { // Nếu hàng đợi trống
            front = rear = newNode;
            rear.link = front; // Tạo liên kết vòng
        } else {
            rear.link = newNode; // Liên kết node hiện tại với node mới
            rear = newNode;      // Cập nhật rear
            rear.link = front;   // Cập nhật liên kết vòng
        }
    }

    // Hàm lấy phần tử ra khỏi hàng đợi
    public Integer deQueue() {
        if (front == null) { // Nếu hàng đợi trống
            return null;
        }

        int value = front.data; // Lấy giá trị từ front

        if (front == rear) { // Nếu chỉ còn một phần tử
            front = rear = null; // Đặt lại hàng đợi trống
        } else {
            front = front.link; // Cập nhật front
            rear.link = front;   // Cập nhật liên kết vòng
        }

        return value; // Trả về giá trị đã lấy
    }

    // Hàm hiển thị các phần tử trong hàng đợi
    public void displayQueue() {
        if (front == null) {
            System.out.println("Hàng đợi trống.");
            return;
        }

        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != front);
        System.out.println();
    }
}