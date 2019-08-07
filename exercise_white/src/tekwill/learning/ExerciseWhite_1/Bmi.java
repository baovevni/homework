package tekwill.learning.ExerciseWhite_1;

import java.util.Scanner;

public class Bmi {
    public static final int inchesInFeet = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many feets you are?");
        int heightFoots = scanner.nextInt();
        System.out.println("And how many inches?");
        int heightInches = scanner.nextInt();
        System.out.println("What is your weight in pounds?");
        int weight = scanner.nextInt();
        int heightInInches = (heightFoots * inchesInFeet + (heightInches * inchesInFeet) / inchesInFeet);
        double heightInMeters = heightInInches * 0.0254;
        double weightKg = weight / 2.2;
        double bmi = weightKg / (heightInMeters * heightInMeters);
        System.out.println("Your BMI is " + bmi);

    }
}

