package ExerciseWhite_1;

import java.util.Scanner;

public class Height {
    static int feetCalcValue = 12;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your height in inches");
        int inches = scanner.nextInt();
        int height = inches/feetCalcValue;

        int a = inches%feetCalcValue;
        double b = (double)a/feetCalcValue;
        int c = (int)(b*100);

        System.out.println("Your height equals to " + height + " feets and " + c + " inches");


    }
}