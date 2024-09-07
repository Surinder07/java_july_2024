package sep3.interf;

class Bird {
    public void eat(){
        System.out.println("Bird is eating...");
    }
}
interface CanFly{
    void flying();
}

class Parrot extends Bird implements CanFly {

    @Override
    public void flying() {
        System.out.println("Parrot is Flying... ");
    }
}

public class Main {
    public static void main(String[] args) {
        // can not create object of interface

        Parrot parrot = new Parrot();
        parrot.eat();
        parrot.flying();


    }
}
