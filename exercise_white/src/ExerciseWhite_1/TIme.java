package ExerciseWhite_1;

import java.util.Scanner;

public class TIme {
    public static final int day = 86400;
    public static final int hour = 3600;
    public static final int min = 60;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of seconds:");
        long secondsEntered = scanner.nextLong();
        int days = (int) secondsEntered / day;
        int secondsRemains = (int) secondsEntered - days * day;
        int hours = secondsRemains / hour;
        secondsRemains = secondsRemains - hours * hour;
        int minutes = secondsRemains / min;
        secondsRemains = secondsRemains - minutes * min;
        int seconds = secondsRemains;

        System.out.println(secondsEntered + " of seconds = " + days + " days " + hours + " hours " + minutes + " minutes and " + seconds + " seconds");
    }
}
