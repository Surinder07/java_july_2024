package sep3;

import java.util.Scanner;

class Parent1 {

    Scanner scanner = new Scanner(System.in);

    public static final int x = 10;
    public void test(){
        System.out.println("Class A");
    }
}

class Parent2 {

    public void test(){
        System.out.println("Class B ");
    }
}
class Child extends Parent1 {
    @Override
    public void test() {
        System.out.println("Child class test method..");
    }
}

public class TestMain {
    public static void main(String[] args) {

        Child child = new Child();
        child.test();

    }

}
