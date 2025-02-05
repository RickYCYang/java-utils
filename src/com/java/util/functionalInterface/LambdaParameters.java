package com.java.util.functionalInterface;

interface Addable {
    int add(int a, int b);
}


class AddableImpl implements Addable {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}


public class LambdaParameters {
    public static void main(String[] args) {
        // Java compiler will infer the type of the lambda expression
        Addable addition = (a, b) -> a + b;
        int result = addition.add(1, 2);
        System.out.println("Result: " + result);

        Addable addition2 = (int a, int b) -> {
            int c = a + b;
            return c;
        };
        int result2 = addition2.add(3, 4);
        System.out.println("Result2: " + result2);
    }
}
