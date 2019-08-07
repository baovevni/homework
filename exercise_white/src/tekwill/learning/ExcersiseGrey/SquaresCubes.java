package tekwill.learning.ExcersiseGrey;

import java.util.Scanner;

public class SquaresCubes {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("%-10s%-10s%-10s\n", "numbers", "square", "cube");
        for (int i = 0; i < (number + 1); i++) {
            System.out.printf("%-10d%-10d%-10d\n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));

        }
    }
}
