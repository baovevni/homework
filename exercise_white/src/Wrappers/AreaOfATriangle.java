package Wrappers;

import java.util.Scanner;

public class AreaOfATriangle {
    public static void main(String[] args) {
        System.out.println("Enter the points of a triangle: ");
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();

        double side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double side3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

        double s = (side1 + side2 + side3)/2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.printf("The area of the triangle is %.1f", area);

    }
}
