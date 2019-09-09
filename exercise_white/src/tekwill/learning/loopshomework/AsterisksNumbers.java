package tekwill.learning.loopshomework;

import java.util.Scanner;

public class AsterisksNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 values form 1 to 10: ");
        int i = in.nextInt();
        for (int j = 0; j < i; j++) {
            System.out.println("Enter values: ");
            int b = in.nextInt();
            for(int k = 1; k <= b; k++) {
                System.out.print("*");
            }
        }
    }
}
