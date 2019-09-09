package tekwill.learning.loopshomework;

import java.util.Scanner;

public class NumberOfValues {
    public static void main(String[] args) {
        System.out.println("Enter some integers. The input ends if it is 0:");
        Scanner in = new Scanner(System.in);
        int countOfPositiveValues = 0;
        int countOfNegativeValues = 0;
        boolean zeros = false;
        do {
            int value = in.nextInt();
            if (value > 0) {
                countOfPositiveValues++;
            }else if (value < 0){
                countOfNegativeValues++;
            }else{
                zeros = true;
            }
        }while (!zeros);
        System.out.printf("Number of positives is %d\n", countOfPositiveValues);
        System.out.printf("Number of negatives is %d", countOfNegativeValues);
    }
}
