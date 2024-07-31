package july27;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

      /*  int x = 10;
        int y = 20;
        int sum = x + y;*/


        // Scanner , which used to take user input

        // create this first
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");

        int x = scanner.nextInt();

        System.out.println("Enter the second number ");

        int y = scanner.nextInt();

        int sum = x + y;

        System.out.println(sum);




    }
}
