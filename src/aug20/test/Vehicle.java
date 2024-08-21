package aug20.test;

public class Vehicle extends Object{
    String model;
    String make;

    public Vehicle(String model, String make) {
        this.model = model;
        this.make = make;
    }
}
class Car extends Vehicle {

    public Car(String model, String make) {
        super(model, make);
    }
}
class Honda extends Car {
    public Honda(String model, String make) {
        super(model, make);
    }
}
class Test {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic");

    }
}
