package tekwill.learning.flows.homework;

import java.util.Scanner;

public class SoundSpeed {

    public static final int SPEED_IN_AIR_COEFFICIENT = 1100;
    public static final int SPEED_IN_WATER_COEFFICIENT = 4900;
    public static final int SPEED_IN_STEEL_COEFFICIENT = 16400;

    public static void main(String[] args) {
        System.out.println("Enter the medium: ->");
        Scanner in = new Scanner(System.in);
        String medium = in.next();
        if (medium.contentEquals("air") || medium.contentEquals("water") || medium.contentEquals("steel")) {
            System.out.println("Enter the distance in feet: ->");
            double distance = in.nextDouble();
            double time = 0;
            boolean def = false;

            switch (medium) {
                case "air":
                    time = distance / SPEED_IN_AIR_COEFFICIENT;
                    break;
                case "water":
                    time = distance / SPEED_IN_WATER_COEFFICIENT;
                    break;
                case "steel":
                    time = distance / SPEED_IN_STEEL_COEFFICIENT;
                    break;
                default:
                    def = true;
                    break;
            }
            if (!def) {
                System.out.printf("%.4f of seconds it will take sound to go though the %s", time, medium);
            }
        } else {
            System.out.printf("%s is not a valid medium", medium);
        }
    }
}
