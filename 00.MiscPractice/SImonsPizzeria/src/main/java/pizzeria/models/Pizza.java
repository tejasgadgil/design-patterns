package pizzeria.models;


import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private List<String> toppingsList;
    private double price;

    public Pizza() {
        this.toppingsList = new ArrayList<>();
        this.price = 10.0; // Base price for the pizza
    }


    public void addTopping(String topping){
        toppingsList.add(topping);
    }

    public List<String> getToppingsList(){
        return toppingsList;
    }

    public double getPrice() {
        return price;
    }
}
