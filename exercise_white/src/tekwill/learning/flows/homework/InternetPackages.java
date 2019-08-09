package tekwill.learning.flows.homework;

import java.util.Scanner;

public class InternetPackages {

    public static final double PRICE_PACKAGE_A = 9.95;
    public static final int HOURS_IN_PACKAGE_A = 10;
    public static final int PRICE_PER_HOUR_A = 2;
    public static final double PRICE_PACKAGE_B = 13.95;
    public static final int HOURS_IN_PACKAGE_B = 20;
    public static final int PRICE_PER_HOUR_B = 1;
    public static final double PRICE_PACKAGE_C = 19.95;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("Enter the package: ->");
            String pack = in.next().toUpperCase();
            if (pack.equals("A") || pack.equals("B") || pack.equals("C")) {
                if (pack.equals("C")) {
                    System.out.printf("Total Charges: %.2f", PRICE_PACKAGE_C);
                    again = false;
                } else{
                    System.out.println("Enter the amount of hours used: ->");
                    int hours = in.nextInt();
                    double totalCharges = 0;
                    double extraHours;
                    double extraHoursPrice;

                    switch (pack) {
                        case "A":
                            if (hours > HOURS_IN_PACKAGE_A) {
                                extraHours = hours - HOURS_IN_PACKAGE_A;
                                extraHoursPrice = extraHours * PRICE_PER_HOUR_A;
                                totalCharges = extraHoursPrice + PRICE_PACKAGE_A;
                            } else {
                                totalCharges = PRICE_PACKAGE_A;
                            }
                            break;
                        case "B":
                            if (hours > HOURS_IN_PACKAGE_B) {
                                extraHours = hours - HOURS_IN_PACKAGE_B;
                                extraHoursPrice = extraHours * PRICE_PER_HOUR_B;
                                totalCharges = extraHoursPrice + PRICE_PACKAGE_B;
                            } else {
                                totalCharges = PRICE_PACKAGE_B;
                            }
                            break;

                    }
                        System.out.printf("Total Charges: %.2f", totalCharges);
                        break;
                }
            } else {
                System.out.printf("%s - not a package, try again -> true for again false for finish\n", pack);
                again = in.nextBoolean();
            }

        } while (again);
        in.close();
    }
}
