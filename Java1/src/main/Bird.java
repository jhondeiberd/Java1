package main;

public class Bird extends Animal {

    Bird(Color color, int age, int nbOfLegs){
        super(color, age, nbOfLegs);
    }

    public void fly(){
        System.out.println("This bird can fly");

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("This bird can eat");
    }
}
