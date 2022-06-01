package dragonproject;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        System.out.printf("You are in a land full of dragons. In front of you,\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "Which cave will you go into? (1 or 2)\n");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 1){
            System.out.printf("You approach the cave...\n" +
                    "It is dark and spooky..\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                    "Gobbles you down in one bite!\n");

        } else if (input == 2){ System.out.printf("You enter the cave...\n"+
                "It's dark, but only for a moment..\n"+
                "A burst of fire shoots out!\n" +
                "You use your shield and block the fire.\n"+
                "You flee out of the cave in terror!\n");

        }
    }


}
