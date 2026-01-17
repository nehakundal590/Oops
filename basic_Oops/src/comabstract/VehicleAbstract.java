package comabstract;

abstract class Vehicle {

    void start() {   // common method
        System.out.println("Vehicle is starting");
    }

    abstract void fuelType(); // different for each vehicle
}

class Car extends Vehicle {
    void fuelType() {
        System.out.println("Car uses Petrol");
    }
}

class Bike extends Vehicle {
    void fuelType() {
        System.out.println("Bike uses Petrol");
    }
}

public class VehicleAbstract {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        v1.start();
        v1.fuelType();

        System.out.println();

        Vehicle v2 = new Bike();
        v2.start();
        v2.fuelType();
    }
}

