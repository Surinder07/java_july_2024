package aug3;

public class MethodsDemo {


    // methods , functions

    // access modifier
    // parameters
    public void show(int x, int y ) {
        System.out.println("Printing inside method...");
    }






    public String greeting(String name){
        return "Hello " + name;
    }


    public static void main(String[] args) {

        MethodsDemo m = new MethodsDemo();
        String result = m.greeting("Ayushi");
        System.out.println(result);


        System.out.println(m.greeting("Sunny"));
        String output = m.greeting("Shubham");
        System.out.println(output);

    }



}
