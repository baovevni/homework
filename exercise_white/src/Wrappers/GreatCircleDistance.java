package Wrappers;

import java.util.Scanner;

public class GreatCircleDistance {

    public static final double EARTH_RADIUS_COEFFICIENT = 6371.01;

    public static void main(String[] args) {
        System.out.println("Enter point 1 (Latitude and longitude) in degrees: ");
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        x1 = Math.toRadians(x1);
        Double y1 = in.nextDouble();
        y1 = Math.toRadians(y1);
        System.out.println("Enter point 2 (Latitude and longitude) in degrees: ");
        double x2 = in.nextDouble();
        x2 = Math.toRadians(x2);
        Double y2 = in.nextDouble();
        y2 = Math.toRadians(y2);
        double d = EARTH_RADIUS_COEFFICIENT * (Math.acos((Math.sin(x1)) * (Math.sin(x2)) +
                (Math.cos(x1)) * (Math.cos(x2)) * (Math.cos((y1-y2)))));
        System.out.printf("The distance between two points is: %f km", d);
    }
}
