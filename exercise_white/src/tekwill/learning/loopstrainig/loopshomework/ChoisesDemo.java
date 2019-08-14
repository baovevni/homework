package tekwill.learning.loopstrainig.loopshomework;

import java.util.Scanner;

public class ChoisesDemo {
    public static void main(String[] args) {
        System.out.println("Please enter one of the following choises: ");
        System.out.printf("%-15s%-30s\n", "c) carnivore", " p) pianist");
        System.out.printf("%-15s%-30s\n", "t) tree", " g) game");
        Scanner in = new Scanner(System.in);
        boolean again = false;
        char value = in.next().toLowerCase().charAt(0);
        do {
            if (value == 'c' || value == 'p' || value == 't' || value == 'g') {
                again = false;
                String text = "";
                switch (value) {
                    case 'c':
                        text = " carnivore";
                        break;
                    case 'p':
                        text = " pianist";
                        break;
                    case 't':
                        text = " tree";
                        break;
                    case 'g':
                        text = " game";
                        break;
                    default:
                        again = true;
                }
                System.out.printf("A maple is a %s", text);
                break;
            } else {
                System.out.println("Please enter a 'c', 'p', 't' or 'g': ");
                value = in.next().toLowerCase().charAt(0);
            }
        } while (again = true);
    }
}