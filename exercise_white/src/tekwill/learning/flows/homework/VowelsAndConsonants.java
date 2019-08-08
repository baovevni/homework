package tekwill.learning.flows.homework;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean again = false;
        do {
            System.out.print("Input alphabet: ");
            char c = in.next().toLowerCase().charAt(0);
            boolean def = false;
            if (Character.isAlphabetic(c)) {
                switch (c) {
                    case 'a':
                    case 'o':
                    case 'u':
                    case 'i':
                    case 'e':
                        System.out.printf("'%s' is vowel", c);
                        break;
                    default:
                        def = true;
                        System.out.printf("'%s' is consonant", c);
                        break;
                }
            } else {
                System.out.printf("%s is not an alphabet!\nDo you want to try again? enter true or false\n", c);
                again = in.nextBoolean();
            }if(def){
                break;
            }
        }while (again);
        in.close();
    }
}
