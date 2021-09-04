public class Bird extends Animal {

    Bird(Color color, int age, int nbOflegs){
        //super(color, age, nbOflegs);
    }

    public void fly(){
        System.out.println("This bird can fly");
    }

    @Override
    public void eat(){
        //System.out.println("This bird can eat");
    }
}
