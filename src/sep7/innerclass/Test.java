package sep7.innerclass;


class OuterClassDemo {

    int x = 10;

    class InnerClassDemo {
        int y = 20;

        public void innerClassMethod(){
            System.out.println("Inside inner class method...");
        }
    }
}


public class Test {
    public static void main(String[] args) {

        OuterClassDemo obj1 = new OuterClassDemo();
        OuterClassDemo.InnerClassDemo obj2 = obj1.new InnerClassDemo();

        obj2.innerClassMethod();
        obj2.y = 100;
        System.out.println(obj2.y);
    }
}
