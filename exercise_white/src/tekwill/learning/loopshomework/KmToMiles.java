package tekwill.learning.loopshomework;

public class KmToMiles {
    public static final double ONE_MILE = 1.609;

    public static void main(String[] args) {
        System.out.printf("%-15s%s%5s%15s%10s\n", "Miles", "Kilometers", "|", "Kilometers", "Miles");
        for (int i = 1; i <= 10; i++) {
            int miles = (i+1)*10;
            System.out.printf("%-15d%.3f%10s%7s%21f\n", i, i * ONE_MILE, "|", miles, miles/ONE_MILE);
        }
    }
}
