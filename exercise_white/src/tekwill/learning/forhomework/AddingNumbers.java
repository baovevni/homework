package tekwill.learning.forhomework;

import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        boolean notZero = true;
        do {
            System.out.println("enter an integer: -> ");
            int number = in.nextInt();
            if (number != 0) {
                sum += number;
                System.out.println(sum);
            } else {
                notZero = false;
                System.out.println("end");
            }
        } while (notZero);
    }
}