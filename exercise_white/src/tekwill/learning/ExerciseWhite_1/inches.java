package tekwill.learning.ExerciseWhite_1;

import java.util.Scanner;

public class inches {
    public static final int INCH_TO_FEE_FACTOR = 12;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height in inches");
        int inches = scanner.nextInt();
        int feet = inches / INCH_TO_FEE_FACTOR;
        int remainingInches = inches - (feet * INCH_TO_FEE_FACTOR);
        System.out.println(feet + " feet and " + remainingInches + " inches ");
    }
}

