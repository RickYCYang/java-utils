package com.java.util.defaultAndStaticMethod;

interface Vehicle {
    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn() {
        return "Turning vehicle alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning vehicle alarm off.";
    }

    static String getCompany() {
        return "Benz";
    }
}


class Car implements Vehicle {

    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }
}


public class DefaultMethodDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());

        // default method
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());

        // static method
        System.out.println(Vehicle.getCompany());

    }
}
