package tekwill.learning.methods;

public class Unicorn{

    public static final String TYPE_OF_ANIMAL = "Mythic";

    private String name;
    private String color;
    private int ageInYears;

    {
        System.out.println("An unicorn is being born");
    }

    // constructor Overloading
    public Unicorn(){
        this("unknown", "default", 0);

    }

    public Unicorn(String name){
//        this.name = name;
//        this.color = "Pink";
//        this.ageInYears = 1001;
        this(name, "Pink", 1001); // this - should always be first in code
       // this(); - multiple calls are not allowed
    }

    public Unicorn(String name, String color, int ageInYears){
        this.name = name;
        this.color = color;
        this.ageInYears = ageInYears;

    }

    //getter 0 method parameters 1 return
    //access modifier | non-access modifier | return Type | method Name | (method Parameters)|
    public String getName(){
        //return statement
        return name;
    }

    //setter 1 method parameters 0 return
    public void setName(String name){
        this.name = name; //this allows you to refer to the current instance
        return;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getAgeInYears(){
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears){
        this.ageInYears = ageInYears;
    }

    public void fly(){
        System.out.println(name + " flying...");
    }

    public void run(){
        System.out.println(name + " running...");
    }

    public void executeSuperPower(String superpower){
        System.out.println(name + " executing < "+ superpower + " >");
    }

    //overloading
    public void executeSuperPower(String superpower, int numberOfTimes){
        for (int i = 0; i < numberOfTimes; i++) {
            executeSuperPower(superpower);
        }
    }

    //overriding
    @Override
    public String toString(){
        return "Unicorn { name = " +
                this.name + ", color = " +
                this.color + ", ageInYears = " +
                this.ageInYears + " }";
    }

}