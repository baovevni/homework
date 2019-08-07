package tekwill.learning.wrappers;

        import java.util.Scanner;

public class ASCIIToCharacter {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
//        System.out.println((char)a);
        Integer b = Integer.valueOf(String.valueOf((int)a));
        System.out.printf("The Unicode for the character %s is %d", a, b);
    }
}
