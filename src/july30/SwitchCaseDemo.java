package july30;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input for switch");
        int input = scanner.nextInt();

        switch (input) {

            case 1:
                System.out.println("Hello I am in case 1");
             break;

            case 2:
                System.out.println("hello I am in case 2");

            case 3:
                System.out.println("hello I am in case 3");
                break;

            default:
                System.out.println("Invalid input... Please enter among 1,2,3");
        }





        /*

        switch(int_type) {
            case int_type:
             // logic
            break;

            case int_type:
             // logic
            break;


            case int_type:
             // logic
            break;

            default:
            // this should work as default value


        }




         */



    }
}
