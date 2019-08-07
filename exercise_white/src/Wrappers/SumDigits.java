package Wrappers;

        import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println("Enter an Integer between 0 and 1000");
        Scanner in = new Scanner(System.in);
        Integer number = in.nextInt();
        int firstDigit = (number / 100) % 10;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;
        int totalDigits = firstDigit+secondDigit+thirdDigit;
        System.out.println("The sum of all Digits is " + totalDigits);
    }
}
