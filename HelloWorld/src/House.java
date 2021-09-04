public abstract class House {
    //public String color;
    public Color color;

    //House(String color){
        //this.color = color;
    //}
    House(Color color){
        this.color = color;
    }

    public void print(){
        System.out.println(this.color);
    };

}
