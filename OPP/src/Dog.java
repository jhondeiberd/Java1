public class Dog extends Animal {
    public String breed;
    public String color;

    public Dog(String breed, String color)
    {
        this.breed = breed;
        this.color = color;
    }

    public Dog(String breed, String color, int age, int nbLegs, Classification classification)
    {
        super(age, nbLegs, classification);
        this.breed = breed;
        this.color = color;
    }

}
