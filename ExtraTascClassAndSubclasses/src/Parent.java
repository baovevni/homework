
abstract class Parent {

    public static void main(String[] args) {

        Parent firstClass = new firstSubClass();
        firstClass.simpleMessage();

        Parent secondClass = new secondClass();
        secondClass.simpleMessage();
    }

    public abstract void simpleMessage();

}