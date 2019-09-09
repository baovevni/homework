package tekwill.learning.extractInteger;

import java.util.Scanner;

public class SumDigits {
    public static final int CALCULATION_COEFFICIENT = 10;

    Scanner s = new Scanner(System.in);
    int integerEntered, nextInt, sum = 0;

    public void calculationOfIntegers(){
        nextInt = integerEntered % CALCULATION_COEFFICIENT;
        sum += nextInt;
        integerEntered = integerEntered / CALCULATION_COEFFICIENT;
    }

    public void play() {
        System.out.println("Enter the number: ");
        integerEntered = s.nextInt();
        while (integerEntered > 0) {
        calculationOfIntegers();
        }
        System.out.println("Sum of Digits = " + sum);
    }
}
