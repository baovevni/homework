package tekwill.learning.wrappers;

import java.util.Scanner;

public class PhoneKeypads {
    public static void main(String[] args) {
        System.out.println("Enter a letter: ");
        Scanner in = new Scanner(System.in);
        Character l = in.next().toUpperCase().charAt(0);
        int num = 0;
        if (Character.isAlphabetic(l)) {
            if (l == 'A' || l == 'B' || l == 'C') {
                num = 2;
            } else if (l == 'D' || l == 'E' || l == 'F') {
                num = 3;
            } else if (l == 'G' || l == 'H' || l == 'I') {
                num = 4;
            } else if (l == 'J' || l == 'K' || l == 'L') {
                num = 5;
            } else if (l == 'M' || l == 'N' || l == 'O') {
                num = 6;
            } else if (l == 'P' || l == 'Q' || l == 'R' || l == 'S') {
                num = 7;
            } else if (l == 'T' || l == 'U' || l == 'V') {
                num = 8;
            } else if (l == 'W' || l == 'X' || l == 'Y' || l == 'Z') {
                num = 9;
            }
            System.out.printf("The corresponding number is %d", num);
        } else {
            System.out.printf("%s is not a valid letter", l);
        }

    }
}