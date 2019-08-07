package Wrappers;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        System.out.println("Enter a decimal value (0 to 15): ->");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String a = Integer.toHexString(num);
        if(num >= 0 && num <= 15) {
            System.out.printf("The hex value is %S", a);
        }else{
            System.out.printf("%d is an invalid input", num);
        }
    }
}
