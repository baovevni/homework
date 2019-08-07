package Wrappers;

import java.util.Scanner;

public class TipsCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the Subtotal and a Gratuity Rate: ");
        Scanner in = new Scanner(System.in);
        Double subTotal = in.nextDouble();
        Double gRate = in.nextDouble();
        Double gratuityRate = gRate/subTotal;
        Double total = gratuityRate+subTotal;
        System.out.println("The Gratuity is " + gratuityRate + " and Total is " + total);
    }
}
