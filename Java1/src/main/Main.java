package main;

public class Main {
    public static void main(String[] param){

        Bird b = new Bird(Color.Yellow, 3 ,2);
        Animal a = new Animal(Color.Yellow, 3 ,2);
        System.out.println(b.age);
        b.eat();

        System.out.println(b instanceof  Bird);

        //Animal h = new Animal(Color.Pink);
        //h.printColor();

//        String[] names = {"n1", "n2", "n3"};
//
//        for(String s: names)
//            System.out.println(s);
//
//        System.out.println("For loop");
//        for (int i = 0; i < names.length; i++){
//            System.out.println(names[i]);
//        }
//
//        String[] names1 = {"Yves", "Jacques", "Pierre", "Mireille", "Anne-Hélène"};
//        for (String s : names1) {
//            System.out.println(s);
//        }
//
//        for(int i = 0; i < names1.length; i++) {
//            System.out.println(names1[i]);
//        }



//        for (int i = 0; i < 10; i++){
//            System.out.println(i);
//        }
//
//        int i = 0;
//        while (i<10){
//            System.out.println(i);
//            i++;
//
//        }

        /*Door d1 = new Door(10,6);
        Door d2 = new Door(11,7);
        Door d3 = new Door(13,5);

        Door[] doors = {d1, d2, d3};

        Flat f = new Flat("Pink");

        House h = new House("White");//, doors);

        //System.out.println(h.doors[0].height + " - " + h.color);  //3 - gray
        //System.out.println(h.doors[0].height + " - " + h.doors[0].width);  //3 - gray
        */


    }
}

//    public static void table(int number)
//    {
//        for(int i=1; i<=10; i++)
//        {
//            System.out.println(number + " x " + i + " = " + number*i);
//        }
//    }
//    public static void main(String[] arg)
//    {
//        table( 4);
//    }