package pizzeria.decorator;

import pizzeria.models.Pizza;

public class CapsicumDecorator extends PizzaDecorator {
    private static final double PRICE = 7.0;

    public CapsicumDecorator(Pizza pizza) {
        super(pizza);
        addCapsicum();
    }

    private void addCapsicum() {
        System.out.println("[Decorator] Adding capsicum!");
        pizza.addTopping("Capsicum");
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + PRICE;
    }
}