package tekwill.learning.wrappers;

import java.util.Scanner;

public class RadiusAndVolume {
    public static void main(String[] args) {
        System.out.println("Enter the Radius and the Length of a cylinder: ");
        Scanner in = new Scanner(System.in);
        Double rad = in.nextDouble();
        Double len = in.nextDouble();
        double area = rad * rad * Math.PI;
        double volume = area * len;
        System.out.printf("The area is " + "%.4f", + area);
        System.out.printf("The volume is " + "%.4f", + volume);
    }
}
