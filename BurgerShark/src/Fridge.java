import java.util.ArrayList;

public class Fridge {

    public static ArrayList<Burger> prepareBurgers(){
        ArrayList<Burger> allBurgers = new ArrayList<>();

        BasicBurger bb = new BasicBurger();
        HealthyBurger hb = new HealthyBurger();
        DeluxeBurger db = new DeluxeBurger();

        allBurgers.add(bb);
        allBurgers.add(hb);
        allBurgers.add(db);

        return allBurgers;
    }

    public static ArrayList<Topping> prepareToppings(){
        ArrayList<Topping> allToppings = new ArrayList<>();

        Topping tomato = new Topping("Tomato",0.27);
        Topping lettuce = new Topping("Lettuce",0.72);
        Topping cheese = new Topping("Cheese",1.13);
        Topping carrot = new Topping("Carrot",2.75);
        Topping greenPepper = new Topping("Green Pepper",0.57);
        Topping olives = new Topping("Olives",1.17);

        allToppings.add(tomato);
        allToppings.add(lettuce);
        allToppings.add(cheese);
        allToppings.add(carrot);
        allToppings.add(greenPepper);
        allToppings.add(olives);

        return allToppings;
    }

}

