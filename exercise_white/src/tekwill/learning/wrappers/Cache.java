package tekwill.learning.wrappers;

public class Cache {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(1);

        System.out.println(a == b);
        System.out.println(a.equals(b));

        Integer d = Integer.valueOf(1);
        Integer c = Integer.valueOf(1);

        System.out.println(d == c);
        System.out.println(d.equals(c));

    }
}
