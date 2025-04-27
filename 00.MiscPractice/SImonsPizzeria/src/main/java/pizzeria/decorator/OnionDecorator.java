package pizzeria.decorator;

import pizzeria.models.Pizza;

public class OnionDecorator extends PizzaDecorator {
    private static final double PRICE = 5.0;

    public OnionDecorator(Pizza pizza) {
        super(pizza);
        addOnion();
    }

    private void addOnion() {
        System.out.println("[Decorator] Adding onion!");
        pizza.addTopping("Onion");
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + PRICE;
    }
}