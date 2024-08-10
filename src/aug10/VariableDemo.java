package aug10;

public class VariableDemo {

    // static is sharebale resource of the class
    static int x = 10;
    public void test(int x){
        System.out.println(x);
    }


    public static void main(String[] args) {

        VariableDemo variableDemo = new VariableDemo();
        variableDemo.test(120);

    }
}
