package Wrappers;

import java.util.Scanner;

public class CharacterToASCII {
    public static void main(String[] args) {
        System.out.println("Enter an ASCII code: ");
        Scanner in = new Scanner(System.in);
        Integer a = in.nextInt();
//        System.out.println((char)a);
        String b = String.valueOf(Character.toChars(a));
        System.out.printf("The character for ASCII code %d is %s", a, b);
    }
}
