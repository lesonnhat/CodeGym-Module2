package org.example;

class MyLinkedList<E> {
    private Node<E> head; // Đầu danh sách
    private int numNodes; // Số nút trong danh sách

    public MyLinkedList() {
        head = null; // Khởi tạo danh sách rỗng
        numNodes = 0;
    }

    // Thêm một phần tử mới vào danh sách
    public void add(E element) {
        addLast(element);
    }

    // Thêm một phần tử mới vào đầu danh sách
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = head; // Gán con trỏ của nút mới trỏ đến đầu danh sách hiện tại
        head = newNode; // Cập nhật đầu danh sách
        numNodes++;
    }

    // Thêm một phần tử mới vào cuối danh sách
    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            head = newNode; // Nếu danh sách rỗng, gán nút mới là đầu
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next; // Duyệt đến nút cuối
            }
            current.next = newNode; // Gán nút mới vào cuối danh sách
        }
        numNodes++;
    }

    // Xóa phần tử tại vị trí index
    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        if (index == 0) {
            E data = head.data;
            head = head.next; // Cập nhật đầu danh sách
            numNodes--;
            return data;
        }

        Node<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next; // Duyệt đến nút trước nút cần xóa
        }
        E data = current.next.data; // Lưu dữ liệu của nút cần xóa
        current.next = current.next.next; // Bỏ qua nút cần xóa
        numNodes--;
        return data;
    }

    // Xóa phần tử cho trước
    public boolean remove(E o) {
        if (head == null) return false;

        if (head.data.equals(o)) {
            head = head.next; // Nếu phần tử là đầu danh sách
            numNodes--;
            return true;
        }

        Node<E> current = head;
        while (current.next != null) {
            if (current.next.data.equals(o)) {
                current.next = current.next.next; // Bỏ qua nút cần xóa
                numNodes--;
                return true;
            }
            current = current.next;
        }
        return false; // Nếu không tìm thấy phần tử
    }

    // Truy cập một phần tử trong danh sách
    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next; // Duyệt đến nút tại vị trí index
        }
        return current.data;
    }

    // Trả về số lượng các phần tử có trong danh sách
    public int size() {
        return numNodes;
    }

    // In các phần tử trong danh sách
    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); // Kết thúc danh sách
    }

    // Sao chép danh sách ra một danh sách khác
    public MyLinkedList<E> clone() {
        MyLinkedList<E> clonedList = new MyLinkedList<>();
        Node<E> current = head;
        while (current != null) {
            clonedList.add(current.data); // Thêm từng phần tử vào danh sách mới
            current = current.next;
        }
        return clonedList;
    }

    // Kiểm tra phần tử có trong danh sách không
    public boolean contains(E o) {
        Node<E> current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Trả về vị trí của phần tử o trong danh sách
    public int indexOf(E o) {
        Node<E> current = head;
        for (int index = 0; current != null; index++) {
            if (current.data.equals(o)) {
                return index; // Trả về chỉ số nếu tìm thấy
            }
            current = current.next;
        }
        return -1; // Không tìm thấy phần tử
    }
}