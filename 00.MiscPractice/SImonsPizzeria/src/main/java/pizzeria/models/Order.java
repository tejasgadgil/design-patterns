package pizzeria.models;

public class Order {

    private Pizza expectedPizza;

    public Order(Pizza pizza){
        this.expectedPizza = pizza;
    }

    public Pizza getExpectedPizza() {
        return expectedPizza;
    }

}
