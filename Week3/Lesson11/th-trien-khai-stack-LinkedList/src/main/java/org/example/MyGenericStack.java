package org.example;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.push(element);
    }

    public T pop() {
        return stack.pop();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
