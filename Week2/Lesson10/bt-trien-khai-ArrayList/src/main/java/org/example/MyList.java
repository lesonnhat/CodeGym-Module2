package org.example;

import java.util.Arrays;

class MyList<E> {
    private int size = 0; // Kích thước hiện tại của danh sách
    private static final int DEFAULT_CAPACITY = 10; // Kích thước mặc định
    private Object elements[]; // Mảng để lưu trữ các phần tử

    // Constructor với kích thước cụ thể
    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    // Constructor mặc định
    public MyList() {
        this(DEFAULT_CAPACITY);
    }

    // Phương thức để thêm phần tử vào cuối danh sách
    public void add(E element) {
        ensureCapacity(size + 1);
        elements[size++] = element; // Thêm phần tử vào cuối danh sách
    }

    // Phương thức để thêm phần tử vào chỉ số cụ thể
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1]; // Dịch chuyển các phần tử
        }
        elements[index] = element; // Thêm phần tử mới
        size++;
    }

    // Phương thức để xóa phần tử
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1]; // Dịch chuyển các phần tử
        }
        elements[--size] = null; // Xóa phần tử cuối cùng
        return element;
    }

    // Phương thức để lấy kích thước
    public int size() {
        return size;
    }

    // Phương thức để kiểm tra phần tử có tồn tại không
    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    // Phương thức để lấy chỉ số của phần tử
    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1; // Không tìm thấy
    }

    // Phương thức để đảm bảo kích thước tối thiểu
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    // Phương thức để lấy phần tử tại chỉ số
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    // Phương thức để xóa tất cả phần tử
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0; // Đặt kích thước về 0
    }

    // Phương thức để sao chép danh sách
    @Override
    protected Object clone() {
        MyList<E> clonedList = new MyList<>(size);
        clonedList.elements = Arrays.copyOf(elements, size);
        clonedList.size = this.size;
        return clonedList;
    }
}