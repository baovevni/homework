package tekwill.learning.loopstrainig;

public class LabelsBreakDemo {
    public static void main(String[] args) {
        // zero example
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + " / " + j);
                if (j == 2)
                    break;
            }
            System.out.println("______");
// second example
            for (i = 0; i < 5; i++) {
                outer:
                for (int j = 0; j < 5; j++) {
                    System.out.println(i + " / " + j);
                    if (j == 2)
                        break outer;
                }
                System.out.println();
            }
        }
    }
}
