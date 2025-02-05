package com.java.util.functionalInterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImple implements Supplier<LocalDateTime> {
    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}


public class SupplierDemo {
    public static void main(String[] args) {
        // traditional way of implementing a functional interface
        Supplier<LocalDateTime> supplier = new SupplierImple();
        System.out.println(supplier.get());

        // using lambda expression
        Supplier<LocalDateTime> supplier2 = () -> LocalDateTime.now();
        System.out.println(supplier2.get());
    }
}
