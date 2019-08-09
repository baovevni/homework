package tekwill.learning.flows.homework;

import java.util.Scanner;

public class RomanLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean again = true;
        do {
            System.out.println("Enter a number within 1 and 10: -> ");
            int number = in.nextInt();

            String roNum = "";
            boolean def = false;

            switch (number) {
                case 1:
                    roNum = "I";
                    break;
                case 2:
                    roNum = "II";
                    break;
                case 3:
                    roNum = "III";
                    break;
                case 4:
                    roNum = "IV";
                    break;
                case 5:
                    roNum = "V";
                    break;
                case 6:
                    roNum = "VI";
                    break;
                case 7:
                    roNum = "VII";
                    break;
                case 8:
                    roNum = "VIII";
                    break;
                case 9:
                    roNum = "IX";
                    break;
                case 10:
                    roNum = "X";
                    break;
                default:
                    def = true;
                    System.out.println("The number you entered is not in range from 1 to 10");
                    System.out.println("Do you want to try again? true of false");
                    again = in.nextBoolean();
                    break;
            }
            if (!def) {
                System.out.printf("Roman numeral version of number %d is %s", number, roNum);
                again = false;
            }

        }while (again);
    }

}
