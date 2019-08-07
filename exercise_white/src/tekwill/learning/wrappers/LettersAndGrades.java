package tekwill.learning.wrappers;

import java.util.Scanner;

public class LettersAndGrades {
    public static void main(String[] args) {
        System.out.println("Enter a letter Grade: ");
        Scanner in = new Scanner(System.in);
        String grade = in.next().toUpperCase();

        int num = 0;

        switch (grade) {
            case "A":
                num = 4;
                break;
            case "B":
                num = 3;
                break;
            case "C":
                num = 2;
                break;
            case "D":
                num = 1;
                break;
            case "E":
                num = 0;
                break;
            default:
                System.out.printf("%s is an invalid grade", grade);
                break;
        }
        System.out.printf("The numeric value of grade %s is %d", grade, num);
    }
}
