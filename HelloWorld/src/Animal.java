public abstract class Animal {
    //public String color;
    public Color color;
    public int age;
    public int nbOflegs;

    Animal(){
        //this(Color.Yellow, 12);
    }

    Animal(Color color, int age, int nbOfLegs) {
        this.color = color;
        this.age = age;
        this.nbOflegs = nbOfLegs;
    }

    public void eat(){
        //this(Color.Yellow, 12,4);
        //System.out.println("This animal can eat");
    }


    //Animal(Color color){
    //    this.color = color;
    //}

    //public void print(){
     //   System.out.println(this.color);
    //};

    //House(String color){
    //this.color = color;
    //}
}
