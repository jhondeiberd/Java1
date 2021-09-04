public class DeluxeBurger extends Burger {
    private String rollType;
    private String pathImg;

    DeluxeBurger(){
        super("Deluxe Burger",14.54,2);
        this.rollType = "Sousage";

    }

    public String getRollType() {
        return rollType;
    }

    @Override
    public String toString() {
        return String.format("%s with %s :- \nCost:  $%.2f \nMax Toppings: %d\n",
                this.getName(),this.getRollType(),this.getPrice(),this.getMaxToppings());
    }
}