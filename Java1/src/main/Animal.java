package main;

public class Animal {
    public int age;
    public int nbOfLegs;
    public Color color;

    Animal(){}

    Animal(Color color, int age, int nbOfLegs){
        this.color = color;
        this.age = age;
        this.nbOfLegs = nbOfLegs;
    }

    public void eat(){
        System.out.println("I am an animal who eats.");
    }

    public void walk(){
        System.out.println("This animal can to walk");
    }

//    public void printColor(){
//        System.out.println(this.color);
//    }


//    House(String color){
//        this.color = color;
//    }

//    House(String color, Door[] doors){
//        doors[0].width = 100;
//        this.doors = doors;
//        this.color = color;
//    }

//    public void printColor(){
//        System.out.println(color);
//    }
//    public abstract void print();

}
