package com.java.util.functionalInterface;

import java.util.function.Consumer;


// traditional way of implementing a functional interface
class ConsumerImple implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}


public class ConsumerDemo {
    public static void main(String[] args) {
        // traditional way of creating an instance of a functional interface
        Consumer<String> consumer = new ConsumerImple();
        consumer.accept("Hello");

        // using lambda expression
        Consumer<String> consumer2 = s -> System.out.println(s);
        consumer2.accept("Hello");
    }
}
