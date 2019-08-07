package tekwill.learning.ExcersiseGrey;

import java.util.Scanner;

public class SeparateSymbols {
    public static void main(String[] args) {
        int fiveDigitInt;

        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int fourthDigit;
        int fifthDigit;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of 5 digits > ");
        fiveDigitInt = scanner.nextInt();

        fifthDigit = fiveDigitInt % 10;
        fourthDigit = (fiveDigitInt / 10) % 10;
        thirdDigit = (fiveDigitInt / 100) % 10;
        secondDigit = (fiveDigitInt / 1000) % 10;
        firstDigit = (fiveDigitInt / 10000) % 10;


        System.out.print(firstDigit);
        System.out.print("  ");
        System.out.print(secondDigit);
        System.out.print("  ");
        System.out.print(thirdDigit);
        System.out.print("  ");
        System.out.print(fourthDigit);
        System.out.print("  ");
        System.out.print(fifthDigit);





    }
}
