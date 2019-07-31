package ExerciseWhite_1;

import java.util.Scanner;

public class GasConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many km you've driven?");
        int km = scanner.nextInt();
        System.out.println("How many litters of gasoline you've used?");
        double litters = scanner.nextDouble();
        double gasConsumtion = litters/km*100;
        System.out.println("Your gas consumption is: " + gasConsumtion);
    }
}
