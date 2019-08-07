package tekwill.learning.ExerciseWhite_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class lkmToMpg {
    public static final double lkmToMpg = 235.215;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your l/km consumption");
        double lkm = scanner.nextDouble();
        double mpg = lkmToMpg/(lkm/100)/100;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Your gas consumption in MPG = " + df.format(mpg));
    }

}
