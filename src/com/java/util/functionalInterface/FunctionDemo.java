package com.java.util.functionalInterface;

import java.util.function.Function;

// traditional way of implementing a functional interface
class FunctionImple implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}


public class FunctionDemo {
    public static void main(String[] args) {
        // traditional way of creating an instance of a functional interface
        Function<String, Integer> function = new FunctionImple();
        System.out.println(function.apply("Hello"));

        // using lambda expression
        Function<String, Integer> function2 = s -> s.length();
        System.out.println(function2.apply("Hello"));
    }

}
