package aug10;

public class StaticMethodDemo {


    public  static void display(){
        System.out.println("Inside display method.....");
    }
}

class Testing {
    public static void main(String[] args) {

        // when a method is a static

     /*   StaticMethodDemo staticMethodDemo = new StaticMethodDemo();
        staticMethodDemo.display();*/

        StaticMethodDemo.display();


    }
}
/*
create a Student mgmt system

name, email, phone, address, school

static school = "pragra"
create 3-4 objects










 */