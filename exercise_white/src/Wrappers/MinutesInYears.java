package Wrappers;

import java.util.Scanner;

public class MinutesInYears {

    public static final int MINUTES_IN_A_DAY_COEFFICIENT = 1440;
    public static final int DAYS_IN_A_YEAR_COEFFICIENT = 365;

    public static void main(String[] args) {
        System.out.println("Enter the number of minutes: ");
        Scanner in = new Scanner(System.in);
        Integer min = Integer.valueOf(in.nextInt());
        Integer years = min / MINUTES_IN_A_DAY_COEFFICIENT / DAYS_IN_A_YEAR_COEFFICIENT;
        Integer days = (min - (years * MINUTES_IN_A_DAY_COEFFICIENT * DAYS_IN_A_YEAR_COEFFICIENT)) / MINUTES_IN_A_DAY_COEFFICIENT;
        System.out.printf("%d minutes is approximately %d years and %d days ", min, years, days);
    }
}