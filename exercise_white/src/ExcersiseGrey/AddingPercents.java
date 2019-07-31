package ExcersiseGrey;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AddingPercents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount: ");
        double amount = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Amount Entered : $\033[0;4m" + df.format(amount) +"\033[0m");
        System.out.println("With TAX added : $" + df.format(amount*1.055));
    }
}
