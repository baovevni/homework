package tekwill.learning.wrappers;

import java.util.Scanner;

public class Fitting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write a number =>");
        Integer a = in.nextInt();


        if(a > Byte.MIN_VALUE && a < Byte.MAX_VALUE){
            System.out.println(a + " fits in Byte");
        }

        if(a > Short.MIN_VALUE && a < Short.MAX_VALUE){
            System.out.println(a + " fits in Short");
        }

        if(a > Integer.MIN_VALUE && a < Integer.MAX_VALUE){
            System.out.println(a + " fits in Int");
        }

        if(a > Long.MIN_VALUE && a < Long.MAX_VALUE){
            System.out.println(a + " fits in Long");
        }
    }
}