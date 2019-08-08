package tekwill.learning.flows.homework;

import java.util.Scanner;

public class FatCalc {
    public static void main(String[] args) {
        System.out.println("Enter the amount of calories: ");
        Scanner in = new Scanner(System.in);
        double calories = in.nextDouble();
        System.out.println("Enter the fat in grams: ");
        double fat = in.nextDouble();
        double caloriesFromFat = fat * 9;
        double totalCalories = calories+caloriesFromFat;
        double percentage = (caloriesFromFat / totalCalories) * 100;
        System.out.printf("Calories from fat %.0f", percentage);
        if(percentage < 30){
            System.out.println("\nThe food is low in Fat ");
        }else{
            System.out.println("\nThe food is high in Fat");
        }
    }
}
