package tekwill.learning.forhomework;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ->");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter the range of multiplication: ->");
        int r = in.nextInt();
        for (int i = 1; i <= r; i++) {
            int result = n*i;
            System.out.printf("%d X %d = %d \n",n, i, result);
        }
    }
}
