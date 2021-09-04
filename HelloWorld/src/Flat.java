public class Flat extends House{
    Flat(String color){
        super(color);

        System.out.println(this.color);
    }

    public void print(){
        System.out.println("print");
    };
}
