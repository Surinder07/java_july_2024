package aug10;

public class Mobile {

    // brand
    String model;
    int memory;
    String color = "Red";


    public Mobile(String model, int memory, String color) {
        this.model = model;
        this.memory = memory;
        this.color = color;
    }

    public void display(){
        System.out.println("Model  : " + model);
        System.out.println("Memory :  " + memory);
        System.out.println("Color  : " + this.color);
    }



}
