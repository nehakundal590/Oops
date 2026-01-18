package com.inheritance;


class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {          // Car HAS-A Engine
    Engine e = new Engine();

    void drive() {
        e.start();
        System.out.println("Car is running");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}



