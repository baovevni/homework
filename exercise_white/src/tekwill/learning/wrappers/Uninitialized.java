package tekwill.learning.wrappers;

public class Uninitialized {
    int a;
    char b;
    boolean c;
    Short aShort;
    String d;

    public static void main(String[] args) {
        Uninitialized un = new Uninitialized();

        System.out.println(un.a);
        System.out.println(un.b);
        System.out.println(un.c);
        System.out.println(un.aShort);
        System.out.println(un.d);
    }
}
