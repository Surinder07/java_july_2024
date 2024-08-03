package aug3;

import java.util.Scanner;

public class LotterySystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Lucky Number ");
        int lucky = scanner.nextInt();
        int jackpotNumber = 7;

        for (int i = 1; i <100 ; i++) {

            if(lucky == jackpotNumber) {
                System.out.println("You are the  winner ");
                break;
            }
            else {

                System.out.println("You are not the winner.");
            }

        }


    }
}
