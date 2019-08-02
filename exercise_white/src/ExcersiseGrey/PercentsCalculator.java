package ExcersiseGrey;

import java.util.Scanner;

public class PercentsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of loan:");
        double loan = scanner.nextDouble();
        System.out.println("Enter interest rate:");
        double rate = scanner.nextDouble();
        System.out.println("Enter the loan duration in months:");
        int loanDuration = scanner.nextInt();
        double monthlyRatePercent = rate/100/12;
        double monthlyRate = loan*monthlyRatePercent+loan/loanDuration;
        double totalAmount = monthlyRate*loanDuration;
        System.out.printf("Total Loan Amount = " + "%.2f" + "\n", totalAmount);
        System.out.printf("Monthly Rate = " + "%.2f" + "\n", monthlyRate);
        for (int i = 0; i < loanDuration; i++) {
            System.out.printf("Balance after month "+ (i+1) +" = " + "%.2f" + "\n", (totalAmount - monthlyRate*(i+1)));

        }
    }
}
