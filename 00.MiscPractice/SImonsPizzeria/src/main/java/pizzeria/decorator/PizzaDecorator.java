package pizzeria.decorator;

import pizzeria.models.Pizza;

import java.util.List;

// todo: refactor to interface
public abstract class PizzaDecorator extends Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public void addTopping(String topping) {
        pizza.addTopping(topping);
    }

    @Override
    public List<String> getToppingsList() {
        return pizza.getToppingsList();
    }
}
