package tekwill.learning.flows.homework;

import java.util.Scanner;

public class RomanLetters {
    public static void main(String[] args) {
        System.out.println("Enter a number within 1 and 10: -> ");
        Scanner in = new Scanner(System.in);
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
                break;
        }
        if (def == false) {
            System.out.printf("Roman numeral version of number %d is %s", number, roNum);
        }
    }

}
