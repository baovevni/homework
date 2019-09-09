package tekwill.learning.loopshomework;

public class MilesToKm {
    public static final double ONE_MILE = 1.609;

    public static void main(String[] args) {
        System.out.printf("%-15s%s\n", "Miles", "Kilometers");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-15s%.3f\n", i, i * ONE_MILE);
        }
    }
}
