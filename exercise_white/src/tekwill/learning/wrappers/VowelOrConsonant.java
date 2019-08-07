package tekwill.learning.wrappers;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Enter a Letter: ");
        Scanner in = new Scanner(System.in);
        char l = in.next().toLowerCase().charAt(0);
        if (Character.isAlphabetic(l)) {
            if (l == 'a' || l == 'e' || l == 'u' || l == 'i' || l == 'o') {
                System.out.printf("%s is vowel", l);
            } else {
                System.out.printf("%s is consonant", l);
            }
        } else {
            System.out.printf("%s is not a Letter", l);
        }
    }
}
