package aug6;

public class Test {
    public static void main(String[] args) {

        Test obj = new Test();
       // System.out.println("Sum of two nos : "+obj.sum(10, 20));        // calling sum method here
        System.out.println(obj.sum(10, 20));

        //  int avg = sum/2;
       // System.out.println("Avg : "+ avg);
        obj.sum(10,20);
        obj.sum(12.32,123.33);

    }

    public double sum(int x, int y) {
        //int sum = x + y;
        return x+y;
    }

    public double sum(double x, double y) {
        return x + y;
    }

    public int sum(int x, int y, int z, int a) {
        return x + y + z + a;
    }


}



/*

create a overloaded method
with return type string  which accepts String name, String email, String phone as parameter

1. String name
2. String name, email
3. String name, email, phone

print output as
Name : Hello Name

Name, email : Hello Name and your email is email

Name, email , phone :
Hello Shruti, you email is email@gmail.com and your phone number is 344234232











 */