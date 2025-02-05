package com.java.util.methodRef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable {
    void print(String message);
}


public class MethodReferencesDemo {

    public void display(String message) {
        message = message.toUpperCase();
        System.out.println(message);
    }

    public static Integer addition(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        /**
         * 1. method reference to a static method
         **/
        // lambda expression
        Function<Integer, Double> sFunction1 = (input) -> Math.sqrt(input);
        System.out.println(sFunction1.apply(4));

        // method reference
        Function<Integer, Double> sFunction2 = Math::sqrt;
        System.out.println(sFunction2.apply(4));

        // lambda expression
        BiFunction<Integer, Integer, Integer> sFunction3 =
                (a, b) -> MethodReferencesDemo.addition(a, b);
        System.out.println(sFunction3.apply(2, 3));

        // method reference
        BiFunction<Integer, Integer, Integer> sFunction4 = MethodReferencesDemo::addition;
        System.out.println(sFunction4.apply(2, 3));


        /**
         * 2. method reference to an instance method of an object
         **/
        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();

        // lambda expression
        Printable printable1 = (message) -> methodReferencesDemo.display(message);
        printable1.print("Hello");

        // method reference
        Printable printable2 = methodReferencesDemo::display;
        printable2.print("Hello");


        /**
         * 3. Reference to the instance method of an arbitrary object Sometimes, we call a method of
         * argument in the lambda expression. In that case, we can use a method reference to call an
         * instance method of an arbitrary object of a specific type.
         **/

        // lambda expression
        Function<String, String> funtion1 = (input) -> input.toLowerCase();
        System.out.println(funtion1.apply("HELLO"));

        // method reference
        Function<String, String> funtion2 = String::toLowerCase;
        System.out.println(funtion2.apply("HELLO"));

        String[] strArray = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
        String[] strArray2 = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};

        // lambda expression
        Arrays.sort(strArray, (a, b) -> a.compareToIgnoreCase(b));
        System.out.println(Arrays.toString(strArray));

        // method reference
        Arrays.sort(strArray2, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strArray2));


        /**
         * 4. Reference to a constructor
         **/
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        // lambda expression
        Function<List<String>, Set<String>> cFuntiona1 = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(cFuntiona1.apply(fruits));

        // method reference
        Function<List<String>, Set<String>> cFuntiona2 = HashSet::new;
        System.out.println(cFuntiona2.apply(fruits));
    };
}
