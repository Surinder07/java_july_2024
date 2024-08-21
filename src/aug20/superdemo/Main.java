package aug20.superdemo;


class Vehicle {
    int fuelCapacity = 50;

    public Vehicle() {
        System.out.println("Vehicle class default constructor...");
    }

    public Vehicle(int fuelCapacity) {
        this();
        this.fuelCapacity = fuelCapacity;
    }

    public void displayVehicle(){
        System.out.println("Display Vehicle details..");
        System.out.println("Fuel cap of vehicle " + fuelCapacity);
    }
}

class Car extends Vehicle {
    int fuelCapacity = 60;

    Car(){
        super(); // call to super class default constructor...
    }

    public void display(){
        System.out.println("Vehicle information ");
        super.displayVehicle();
        System.out.println("*********");
        System.out.println("Fuel Capacity of Car is " + fuelCapacity);
        System.out.println("Fuel Capacity of Vehicle is " + super.fuelCapacity);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
    }
}
/*
super to refer parent class variables
super to call parent class method
super to call parent class constructor...



 */