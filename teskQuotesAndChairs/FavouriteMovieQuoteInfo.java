package Tekwill;

import java.util.Scanner;

public class FavouriteMovieQuoteInfo {
    public static void main(String[] args) {

        //asking the movie quote

        System.out.println("What is your favourite movie quote?");
        Scanner scanner = new Scanner(System.in);
        String quote = scanner.nextLine();

        //asking the movie name

        System.out.println("What movie it comes from?");
        String movie = scanner.nextLine();

        //asking the character

        System.out.println("Who said it?");
        String character = scanner.nextLine();

        //asking movie year

        System.out.println("What year is this movie?");
        String movieYear = scanner.nextLine();

        //Output the info

        System.out.println("Your favourite movie quote is " + "'" + quote + "'" + " It comes from " + "'" + movie + "'" + " movie" +
                " It was said by " + "'" + character + "'" + " The movie is from " + "'" + movieYear + "'" + " year.");
    }
}
