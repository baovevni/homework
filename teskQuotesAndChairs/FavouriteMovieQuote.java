package Tekwill;

import java.util.Scanner;

public class FavouriteMovieQuote {
    public static void main(String[] args) {

        // asking the movie quote
        System.out.println("What is your favourite movie quote?");
        Scanner scanner = new Scanner(System.in);
        String quote = scanner.nextLine();

        //output the movie quote
        System.out.println("Your favourite quote is: " + "'" + quote + "'");
        scanner.close();
    }
}
