package sep10;


import java.util.Scanner;

class Test {
    public static void main(String[] args) {


        try {
            String s = "Hello";
            System.out.println(s.toUpperCase()); // Null pointer exception

            int x = 10;
            int y = 0;
            int div = x/y;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        finally {
            System.out.println("Stop finally.... ");
        }



    }
}