package Wrappers;

import java.util.Scanner;

public class CelsiusToFarenheit {

    public static final double FAHRENHEIT_CEOFFICIENT = 9.0 / 5;

    public static void main(String[] args) {
        System.out.println("Enter a degree in Celsius -> ");
        Scanner in = new Scanner(System.in);
        Integer celsius = in.nextInt();
        Double fahrenheit = FAHRENHEIT_CEOFFICIENT * celsius + 32;
        System.out.println(celsius + " is " + fahrenheit + " in Fahrenheit");
    }
}
