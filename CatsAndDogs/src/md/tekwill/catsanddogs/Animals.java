package md.tekwill.catsanddogs;


abstract class Animals {
    public static void main(String[] args) {
        Animals cat = new Cats();
        cat.cats();
        Animals dog = new Dogs();
        dog.dogs();
    }

    void cats(){
    }
    void dogs(){
    }

}
