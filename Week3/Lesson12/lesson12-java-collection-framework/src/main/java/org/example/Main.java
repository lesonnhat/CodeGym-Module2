package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args){

//        // Sử dụng các phương thức trong interface Collection
//        ArrayList collection1 = new ArrayList();
//        collection1.add("New York");
//        collection1.add("Atlanta");
//        collection1.add("Dallas");
//        collection1.add("Madison");
//
//        System.out.println("A list of cities in collection1:");
//        System.out.println(collection1);
//
//        System.out.println("\nIs Dallas in collection1? "
//                + collection1.contains("Dallas"));
//
//        collection1.remove("Dallas");
//        System.out.println("\n" + collection1.size() +
//                " cities are in collection1 now");
//
//        Collection collection2 = new ArrayList<>();
//        collection2.add("Seattle");
//        collection2.add("Portland");
//        collection2.add("Los Angeles");
//        collection2.add("Atlanta");
//
//        System.out.println("\nA list of cities in collection2:");
//        System.out.println(collection2);
//
//        ArrayList c1 = (ArrayList) collection1.clone();
//        c1.addAll(collection2);
//        System.out.println("\nCities in collection1 or collection2: ");
//        System.out.println(c1);
//
//        c1 = (ArrayList)(collection1.clone());
//        c1.retainAll(collection2);
//        System.out.print("\nCities in collection1 and collection2: ");
//        System.out.println(c1);
//
//        c1 = (ArrayList)(collection1.clone());
//        c1.removeAll(collection2);
//        System.out.print("\nCities in collection1, but not in 2: ");
//        System.out.println(c1);
//
//        // Iterator
//        Collection<String> collection = new ArrayList<>();
//        collection.add("New York");
//        collection.add("Atlanta");
//        collection.add("Dallas");
//        collection.add("California");
//
//        Iterator<String> iterator = collection.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next().toUpperCase() + " ");
//        }

        // Cấu trúc Map trong Java
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John", 30);
        customers.put("Mike", 28);
        customers.put("Bill", 32);
        customers.put("Maria", 27);

        Set<String> keys = customers.keySet();
        for (String key: keys){
            System.out.println("Key: " + key + ": " + customers.get(key));
        }
    }
}