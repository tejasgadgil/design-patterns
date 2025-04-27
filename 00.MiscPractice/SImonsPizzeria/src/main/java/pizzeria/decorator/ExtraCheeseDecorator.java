package pizzeria.decorator;

import pizzeria.models.Pizza;

public class ExtraCheeseDecorator extends PizzaDecorator{
    public ExtraCheeseDecorator(Pizza pizza) {
        super(pizza);
        addExtraCheese();
    }

    private void addExtraCheese() {
        System.out.println("[Decorator] Adding extra cheese!");
        pizza.addTopping("Extra Cheese");
    }

}
