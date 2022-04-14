package src.util;

import java.util.Scanner;

public class DiceRoll {

    public static int DiceRoll() {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("How many sides does your pair of dice have?");
        int dieSides = Integer.parseInt(sc.nextLine());
        System.out.println("Enter how many times you would like to roll?");
        int numOfRolls = Integer.parseInt(sc.nextLine());
        System.out.println("Please roll the dice");*/
        int dieSides = 6;
        int numOfRolls = 1;

        int min = 1;
        int range = dieSides - min + 1;
        for (int i = 0; i < numOfRolls; i++) {
            int rand = (int) (Math.random() * range) + min;
           // int rand1 = (int) (Math.random() * range) + min;
            System.out.printf("Die One: %d %n", rand);
        }

        return
        /*System.out.println("Do you want to Roll again? (y/n): ");
        String userWantsToContinue = sc.next();

        if (userWantsToContinue.equalsIgnoreCase("y")) {
            DiceRoll();
        } else {
            return;
        }*/
    }
}