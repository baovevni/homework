package tekwill.learning.flows.homework;

import java.util.Scanner;

public class DaysInMonths {

    public static final int DAYS_LOW_COEFFICIENT = 30;
    public static final int DAYS_HIGH_COEFFICIENT = 31;
    public static final String DAYS_FEB_COEFFICIENT = "28 or 29";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean again = false;
        do {
            System.out.println("Input month number: -> ");
            int month = in.nextInt();
            int days = 0;
            String feb;
            boolean february = false;
            boolean def = false;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = DAYS_HIGH_COEFFICIENT;
                    break;
                case 2:
                    february = true;
                    feb = DAYS_FEB_COEFFICIENT;
                    System.out.printf("Total number of days %s", feb);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = DAYS_LOW_COEFFICIENT;
                    break;
                default:
                    def = true;
                    System.out.printf("%d not a valid month\n", month);
                    System.out.println("Do you want to try again? enter true or false");
                    again = in.nextBoolean();
                    break;
            }
            if (!february && !def) {
                System.out.printf("Total number of days %d", days);
                again = false;
            }
        }while (again);
        in.close();
    }
}
