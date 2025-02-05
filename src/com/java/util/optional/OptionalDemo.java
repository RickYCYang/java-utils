package com.java.util.optional;

import java.util.Optional;
import java.util.logging.Logger;

public class OptionalDemo {

    private static final Logger logger = Logger.getLogger(OptionalDemo.class.getName());

    public static void main(String[] args) {
        String email = "rick@gmail";

        // of, empty, ofNullable
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional);
        System.out.println(emailOptional.get()); // get will throw NoSuchElementException if the
                                                 // value is not present, so it is better to use
                                                 // isPresent before as below


        Optional<String> stringOptional = Optional.ofNullable(email);
        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get());
        } else {
            System.out.println("Value is not present");
        }
        // the above code can be written as
        System.out.println(stringOptional.orElse("Value is not present"));

        // orElseGet is used when the value is not present, we need to call a method to get the
        // value, and it accepts a Supplier which is a functional interface, so we can use lambda
        // expression to provide the implementation
        System.out.println(stringOptional.orElseGet(() -> "Value is not present"));

        // throw exception if the value is not present
        System.out.println(stringOptional
                .orElseThrow(() -> new IllegalArgumentException("Value is not present")));

        // ifPresent is used to perform some operation if the value is present
        // it accepts a Consumer which is a functional interface with a method accept and no return,
        // so we can use lambda expression to provide the implementation
        Optional<String> gender = Optional.of("Male");
        gender.ifPresent((s) -> System.out.println("value is present: " + s));


        // filter is used to filter the value based on some condition
        String result = " abc ";
        if (result != null && result.contains("abc")) {
            System.out.println(result);
        }
        // the above code can be written by using filter and ifPresent as below
        Optional<String> resultOptional = Optional.of(result);
        resultOptional.filter(s -> s.contains("abc")).ifPresent(System.out::println);


        // map is used to transform the value if it is present
        // here we trim the string result to have no leading or trailing spaces
        System.out.println(resultOptional.map(String::trim).get());
        resultOptional.map(String::trim).ifPresent(System.out::println);


    }
}
