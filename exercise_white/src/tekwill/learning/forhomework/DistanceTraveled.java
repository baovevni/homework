package tekwill.learning.forhomework;

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        System.out.println("Enter the distance traveled: ->");
        Scanner in = new Scanner(System.in);
        int speed = in.nextInt();
        System.out.println("Enter the hours vehicle traveled: ->");
        int hours = in.nextInt();
        System.out.printf("%-5s%10s\n", "Hours", "Distance");
        System.out.println("---------------");
        for (int i = 1; i <= hours; i++) {
            int distance = i * speed;
            System.out.printf("%2d %8d \n", i, distance);
        }
    }
}
