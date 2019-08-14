package tekwill.learning.loopstrainig;

public class LabelsContinueDemo {
    public static void main(String[] args) {
// first example
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + " / " + j);
                if (j == 2)
                    continue;
            }
            System.out.println("______");
// second example
            for (i = 0; i < 5; i++) {
                outer:
                for (int j = 0; j < 5; j++) {
                    System.out.println(i + " / " + j);
                    if (j == 2)
                        continue outer;
                }
                System.out.println();
            }
        }
    }
}
