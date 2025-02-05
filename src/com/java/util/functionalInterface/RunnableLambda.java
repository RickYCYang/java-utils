package com.java.util.functionalInterface;

class ThredDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("run method called ...");
    }
}


public class RunnableLambda {
    public static void main(String[] args) {
        // traditional way of creating a thread
        Thread thread1 = new Thread(new ThredDemo());
        thread1.start();

        // Runnable is a functional interface, so we can use lambda expression to create an instance
        // of it
        Thread thread2 = new Thread(() -> System.out.println("run method called using lambda ..."));
        thread2.start();
    }
}
