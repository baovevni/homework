package tekwill.learning.nestedifs;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        if (score > 200) {
            if (score < 400) {
                if (score > 300) {
                    System.out.println(1);
                } else
                    System.out.println(2);
            }
            else
                System.out.println(3);
        }
    }
}
