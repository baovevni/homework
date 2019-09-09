package tekwill.learning.loopshomework;

import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        System.out.println("Enter the number of students: ");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        String name;
        int score;
        for (int i = 0; i <= numberOfStudents ; i++) {
            System.out.println("Enter the student's name and score: ");
            name = in.nextLine();
            score = in.nextInt();
            System.out.print(name + " "+ score);
        }

    }
}
