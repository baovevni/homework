package tekwill.learning.rpsgame;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static Random r = new Random();

    public static void main(String[] args) {

        System.out.println("Your choice: => ");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        Scanner s = new Scanner(System.in);
        boolean again = false;
        do {
            int pcChoice = r.nextInt(3) + 1;
            int yourChoice = s.nextInt();
            if (yourChoice == 1 || yourChoice == 2 || yourChoice == 3){
                System.out.println("PC chose " + pcChoice + " and your choice is: " + yourChoice);
                if (pcChoice == 1 && yourChoice == 3) {
                    System.out.println("Rock Beats Scissors");
                } else if (pcChoice == 3 && yourChoice == 2) {
                    System.out.println("Scissors Cuts Paper");
                } else if (pcChoice == 2 && yourChoice == 1) {
                    System.out.println("Paper Wraps Rock");
                } else if (pcChoice == yourChoice) {
                    System.out.println("Same Choice");
                    again = true;
                    System.out.println("Your choice: => ");
                    yourChoice = s.nextInt();
                }
            }else {
                System.out.println("Select 1 to 3: ");

            }
        }while (again = true) ;
    }
}
