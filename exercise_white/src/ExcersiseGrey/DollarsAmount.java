package ExcersiseGrey;

import java.util.Scanner;

public class DollarsAmount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a dollar amount:");
        int amount = scanner.nextInt();
        int twenty = amount / 20;
        int remains = amount % 20;
        int ten = remains / 10;
        remains = remains % 10;
        int five = remains / 5;
        remains = remains % 5;
        int one = remains;
        System.out.println("Dollar amount = " + amount);
        System.out.println();
        System.out.println("$20 bills: " + twenty);
        System.out.println("$10 bills: " + ten);
        System.out.println(" $5 bills: " + five);
        System.out.println(" $1 bills: " + one);
    }
}
