package tekwill.learning.loopstrainig.loopshomework;

import java.util.Scanner;

public class NFactorial {
    public static void main(String[] args) {
        System.out.println("Enter a value: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long fact = 1;
        System.out.printf("%5s%10s\n", "value", "factorial");
        System.out.println("---------------");
        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.printf("%d! %-10d \n", i, fact);
        }
    }
}
