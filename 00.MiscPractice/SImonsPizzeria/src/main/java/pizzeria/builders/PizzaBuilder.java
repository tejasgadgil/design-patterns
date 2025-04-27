package pizzeria.builders;

import pizzeria.decorator.*;
import pizzeria.models.Pizza;

public class PizzaBuilder {

    private Pizza pizza;

    public PizzaBuilder(){
        this.pizza = new Pizza();
    }

    public PizzaBuilder addCheese() {
        pizza.addTopping("Cheese");
        return this;
    }

    public PizzaBuilder addSauce() {
        pizza.addTopping("Sauce");
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        switch (topping.toLowerCase()) {
            case "tomato" -> pizza = new TomatoDecorator(pizza);
            case "onion" -> pizza = new OnionDecorator(pizza);
            case "capsicum" -> pizza = new CapsicumDecorator(pizza);
            case "mushroom" -> pizza = new MushroomDecorator(pizza);
            default -> pizza.addTopping(topping);
        }
        return this;
    }

    public Pizza build() {
        return pizza;
    }

}
