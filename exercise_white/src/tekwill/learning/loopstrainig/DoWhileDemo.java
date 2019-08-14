package tekwill.learning.loopstrainig;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exitSelected = false;
        String phase = "";
        do {
            System.out.println("Enter a phrase >");
            phase = in.nextLine();
            if (phase.toLowerCase().equals("exit")) {
                exitSelected = true;
            } else {
                System.out.println("Entered phrase: " + phase);
            }
        } while (exitSelected == false);

        exitSelected = false;
        while (exitSelected == false) {
            System.out.println("Enter a phrase >");
            phase = in.nextLine();
            if (phase.toLowerCase().equals("exit")) {
                exitSelected = true;
            } else {
                System.out.println("Entered phrase: " + phase);
            }
        }
    }
}
