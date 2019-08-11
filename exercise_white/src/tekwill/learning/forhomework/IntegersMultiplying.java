package tekwill.learning.forhomework;

import java.util.Scanner;

public class IntegersMultiplying {
    public static void main(String[] args) {
        System.out.println("Enter first integer: -> ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.println("Enter second integer: -> ");
        int f = in.nextInt();
        int result = 0;
        for (; i <= f; i++) {
            result +=i;
            System.out.println(result);
        }
    }
}
