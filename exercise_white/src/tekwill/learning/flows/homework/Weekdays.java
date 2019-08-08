package tekwill.learning.flows.homework;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean again = false;
        do {
            System.out.println("Input week number form 1 to 7: -> ");
            int day = in.nextInt();
            boolean def = false;
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    def = true;
                    System.out.println("A regular week contains only 7 days, do you want to tey again? true or false");
                    again = in.nextBoolean();
                    break;
            }if (!def){
                break;
            }
        } while (again);
        in.close();
    }
}
