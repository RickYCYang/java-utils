package com.java.util.collectionAndStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionAndStreamDemo {
    public static void main(String[] args) {

        // List collection is used to store data
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.remove("Apple");

        // Streams are used to perform operations like filter, map, reduce, etc.
        // e.g.
        List<String> result = fruits.stream().filter(fruit -> !(fruit.equals("Grapes"))).toList();
        result.forEach(System.out::println);

        // Difference between == and equals method
        // == compares references (memory addresses),
        // .equals() compares actual content
        System.out.println("Apple" == "Apple");
        String apple = new String("Apple");
        System.out.println("Apple" == apple);
        System.out.println("Apple".equals(apple));

        // Collection can be iterated through using for-each loop or for loop,
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        fruits.forEach(System.out::println);

        // Stream can only be iterated through using forEach method
        fruits.stream().forEach(System.out::println);

        // Collection can be iterated many times
        fruits.forEach(System.out::println);
        fruits.forEach(System.out::println);

        // Stream can only be iterated once
        Stream<String> fruitsStream = fruits.stream();
        fruitsStream.forEach(System.out::println);
        // fruitsStream.forEach(System.out::println); // This will throw an exception
    }
}
