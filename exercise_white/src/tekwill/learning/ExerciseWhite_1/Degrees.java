package tekwill.learning.ExerciseWhite_1;

import java.util.Scanner;

public class Degrees {
    public static final int MINUTES_COEFICIENT = 60;
    public static final int SECONDS_COEFICIENT = 3600;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a latitude in degrees, minutes, and seconds:");
        System.out.println("First enter the degrees: ");
        int degrees = scanner.nextInt();
        System.out.println("Next, enter the minutes of arc: ");
        int minutes = scanner.nextInt();
        System.out.println("Finally, enter the seconds of arc: ");
        int seconds = scanner.nextInt();
        double degreesToDisplay = convertToDecimalDegrees(degrees, minutes, seconds);
//        DecimalFormat df = new DecimalFormat("#.0000");
        System.out.printf(degrees + " degrees, " + minutes + " minutes, " + seconds + " seconds = " + "%.4f" + " degrees", degreesToDisplay);
    }

    public static double convertToDecimalDegrees(int d, int m, int s) {
        return d + ((double) m / MINUTES_COEFICIENT) + ((double) s / SECONDS_COEFICIENT);
    }
}
