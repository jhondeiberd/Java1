import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {




//        Woman w = new Woman();
//        Human h = (Human)w;
//        Human h = w;
//
//        Man man = new Man();
//        Human human = man; // implicit upcasting
//        Man man2 = (Man) human; // explicit downcasting

        int i = 3;
        int j = 1;
        try {
            System.out.println("result = " + (i / j));
        } catch (ArithmeticException e) {
            System.out.println("getmessage():");
            System.out.println(e.getMessage());
            System.out.println(" ");
            System.out.println("toString():");
            System.out.println(e.toString());
            System.out.println(" ");
            System.out.println("printStackTrace():");
            e.printStackTrace();
        } finally {
            System.out.println("procedure executed systematically");
        }


       /*Human h = new Human();
        h.eat();

        Woman w = new Woman();
        w.eat();

        System.out.println();

        Dog doggo = new Dog("Chow-Chow", "Beige", 8, 4, Classification.ANIMALIA);
        System.out.println(doggo.classification);
        System.out.println(doggo.breed);
        System.out.println(doggo.eat());

        Dog rex =  new Dog("Labrador", "Beige");
        System.out.println(rex.classification);
        System.out.println(rex.breed);
        System.out.println(rex.eat());*/

    }
}
