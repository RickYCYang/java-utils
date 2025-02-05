package com.java.util.functionalInterface;

interface Shape {
    // functional interface can only have one abstract method
    void draw();

    default void paint() {
        System.out.println("Painting Shape");
    }

    static void erase() {
        System.out.println("Erasing Shape");
    }
}


public class LambdaExample {
    public static void main(String[] args) {
        Shape circle = new Shape() {
            @Override
            public void draw() {
                System.out.println("Drawing Circle");
            }
        };
        circle.draw();


        Shape rectangle = () -> {
            System.out.println("Drawing Rectangle");
        };
        rectangle.draw();

        Shape square = () -> System.out.println("Drawing Square");;
        // square.draw();
        print(square);

        // Anonymous class
        print(() -> System.out.println("Drawing Triangle"));

    }

    private static void print(Shape shape) {
        shape.draw();
    }
}
