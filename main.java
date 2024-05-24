public class main {
    public void lunch() {
        System.out.println("Dishes should start with a starter->main course->dessert");
    }

    public void starter(int type) {
        System.out.println("Stater has been called out with type" + type);
    }

    public void maincourse(String category, int type) {
        System.out.println("Main course has been called out with category" + category + " type" + type);
    }

    public void dessert(String name){
        System.out.println("Dessert has been called out with name"+name);
    }

    public static void main (String [ args]){
        main ob=new main();
        ob.lunch();
        ob.maincourse();
        ob.dessert();
    }
}