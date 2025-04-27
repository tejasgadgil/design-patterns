package pizzeria.decorator;

import pizzeria.models.Pizza;

public class MushroomDecorator extends PizzaDecorator {
    private static final double PRICE = 3.0;

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
        addMushroom();
    }

    private void addMushroom() {
        System.out.println("[Decorator] Adding mushroom!");
        pizza.addTopping("Mushroom");
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + PRICE;
    }
}
