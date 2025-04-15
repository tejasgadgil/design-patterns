package org.example;

// works in pizza hut
// minimum wage job
// will make what you order

public interface PizzaBuilder {

    public void buildPizzaBase();

    public void buildPizzaSauce();

    public void buildPizzaCheese();

    public void buildPizzaToppings();

    public Pizza getPizza();
}
