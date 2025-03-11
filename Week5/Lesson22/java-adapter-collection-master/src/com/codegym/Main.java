package com.codegym;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        CollectionOperations adapter = new CollectionUtilsAdapter();
        Client client = new Client(adapter);
        client.printMaxValue(numbers);
    }
}
