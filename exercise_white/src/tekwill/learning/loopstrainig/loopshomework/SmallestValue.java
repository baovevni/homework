package tekwill.learning.loopstrainig.loopshomework;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many values will you use?");
        int i = in.nextInt();
        int smallest = Integer.MAX_VALUE;
        for (int j = 0; j < i; j++) {
            System.out.println("enter value: ");
            int number = in.nextInt();
            if (number < smallest){
                smallest=number;
            }
        }
        System.out.printf("Smallest value: %d", smallest);
    }
}
