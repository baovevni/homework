package tekwill.learning.wrappers;

public class StaticDemo {
    static int a = 0;

    public static void main(String[] args) {
        StaticDemo d = new StaticDemo();
        StaticDemo f = new StaticDemo();
        StaticDemo g = new StaticDemo();
        StaticDemo h = new StaticDemo();
        System.out.println(d.a);
        System.out.println(f.a);
        System.out.println(g.a);
        System.out.println(h.a);

        StaticDemo.a = 4;

        System.out.println(d.a);
        System.out.println(f.a);
        System.out.println(g.a);
        System.out.println(h.a);
    }
}
