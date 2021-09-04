public class Animal {
    int age;
    int nbLegs;
    Classification classification;

    public Animal() {}

    public Animal(int age, int nbLegs, Classification classification) {
        this.age = age;
        this.nbLegs = nbLegs;
        this.classification = classification;
    }

    public String eat(){
        return "I am an animal who eats.";
    }

}
