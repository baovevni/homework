package tekwill.learning.flows.homework;

import java.util.Scanner;

public class SoundSpeed {

    public static final int SPEED_OF_SOUND_IN_AIR = 1100;
    public static final int SPEED_OF_SOUND_IN_WATER = 4900;
    public static final int SPEED_OF_SOUND_IN_STEEL = 16400;

    public static void main(String[] args) {
        System.out.println("Enter the medium: ->");
        Scanner in = new Scanner(System.in);
        String medium = in.next();
        if (medium.equals("air") || medium.equals("water") || medium.equals("steel")) {
            System.out.println("Enter the distance in feet: ->");
            double distance = in.nextDouble();
            double time = 0;
            boolean def = false;

            switch (medium) {
                case "air":
                    time = distance / SPEED_OF_SOUND_IN_AIR;
                    break;
                case "water":
                    time = distance / SPEED_OF_SOUND_IN_WATER;
                    break;
                case "steel":
                    time = distance / SPEED_OF_SOUND_IN_STEEL;
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
