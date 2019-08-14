package tekwill.learning.loopstrainig;

public class WhileDemo {
    public static void main(String[] args) {
        boolean bunsAvailable = true;
        int totalBuns = 40;
        int numberOfBurgers = 1;

        while (bunsAvailable){
            System.out.println("Preparing burger " + numberOfBurgers);
            --totalBuns;
            System.out.println("Adding the burger");
            System.out.println("Adding the cheese");
            System.out.println("Adding the pickles");
            System.out.println("Adding the tomatoes");
            System.out.println("Adding the salad");
            --totalBuns;
            System.out.println("Burger is ready\n");
            if(totalBuns == 0)
                bunsAvailable = false;
            else
            numberOfBurgers++;
        }
        System.out.println("Prepared " + numberOfBurgers + " burgers.");
        System.out.println("Remaining buns = " + totalBuns);
    }
}
