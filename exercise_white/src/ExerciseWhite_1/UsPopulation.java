package ExerciseWhite_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UsPopulation {

    public static final int MAX_PERCENT_COEFFICIENT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the world's population:");
        long world = scanner.nextLong();
        System.out.println("Enter the population of the US:");
        int us = scanner.nextInt();
        double percent = (double) us / world * MAX_PERCENT_COEFFICIENT;
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println("The population of the US is " + df.format(percent) + "% of the world population");
    }
}
