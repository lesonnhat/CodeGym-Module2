package org.example;

class Node<E> {
    E data; // Dữ liệu của nút
    Node<E> next; // Con trỏ đến nút tiếp theo

    Node(E data) {
        this.data = data;
        this.next = null; // Khởi tạo con trỏ tiếp theo là null
    }

    E getData() {
        return data;
    }
}