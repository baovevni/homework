package tekwill.learning.forhomework;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            String day = "";
            switch (i) {
                case 1:
                    day = "first";
                    break;
                case 2:
                    day = "second";
                    break;
                case 3:
                    day = "third";
                    break;
                case 4:
                    day = "fourth";
                    break;
                case 5:
                    day = "fifth";
                    break;
                case 6:
                    day = "sixth";
                    break;
                case 7:
                    day = "seventh";
                    break;
                case 8:
                    day = "eigth";
                    break;
                case 9:
                    day = "ninth";
                    break;
                case 10:
                    day = "tenth";
                    break;
                case 11:
                    day = "eleventh";
                    break;
                case 12:
                    day = "twelfth";
                    break;

            }
            System.out.printf("On the %s day of Christmas \nMy true love sent to me \n", day);

            switch (i) {
                case 12:
                    System.out.print("Twelve drummers drumming\n");
                case 11:
                    System.out.print("Eleven pipers piping\n");
                case 10:
                    System.out.print("Ten lords a-leaping\n");
                case 9:
                    System.out.print("Nine ladies dancing\n");
                case 8:
                    System.out.print("Eight maids a-milking\n");
                case 7:
                    System.out.print("Seven swans a-swimming\n");
                case 6:
                    System.out.print("Six geese a-laying\n");
                case 5:
                    System.out.print("Five golden rings\n");
                case 4:
                    System.out.print("Four calling birds\n");
                case 3:
                    System.out.print("Three french hens\n");
                case 2:
                    System.out.print("Two turtle doves, and\n");
                case 1:
                    System.out.println("A partridge in a pear tree");
                    System.out.println();
                    break;
            }
        }
    }
}
