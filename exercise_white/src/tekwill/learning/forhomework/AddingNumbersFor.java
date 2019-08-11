package tekwill.learning.forhomework;

import java.util.Scanner;

public class AddingNumbersFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int number = 1;
        for (; number != 0;) {
            System.out.println("enter an integer: -> ");
            number = in.nextInt();
            if (number != 0) {
                sum += number;
                System.out.println(sum);
            } else {
                System.out.println("end");
            }
        }
    }
}