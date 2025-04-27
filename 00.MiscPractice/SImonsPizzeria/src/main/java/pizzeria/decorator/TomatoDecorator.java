package pizzeria.decorator;

import pizzeria.models.Pizza;

public class TomatoDecorator extends PizzaDecorator{

    private static final double PRICE = 2.0;

    public TomatoDecorator(Pizza pizza) {
        super(pizza);
        addTomato();
    }

    private void addTomato() {
        System.out.println("[Decorator] Adding tomato!");
        pizza.addTopping("Tomato");
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + PRICE;
    }


}
