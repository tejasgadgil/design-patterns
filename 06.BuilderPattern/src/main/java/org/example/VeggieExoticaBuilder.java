package org.example;

public class VeggieExoticaBuilder implements PizzaBuilder {

    // call the worker specialized in veggie exoticas
    // give him a pizza to make
    private Pizza pizza;

    public VeggieExoticaBuilder(){
        this.pizza = new Pizza();
    }

    @Override
    public void buildPizzaBase() {
        pizza.setPizzaBase("Thin Crust");
    }

    @Override
    public void buildPizzaSauce() {
        pizza.setPizzaSauce("Mediterranean Sauce");
    }

    @Override
    public void buildPizzaCheese() {
        pizza.setPizzaCheese("Goat Cheese");
    }

    @Override
    public void buildPizzaToppings() {
        pizza.setPizzaToppings("Tomato, Onion, Corn, Olive, Mushroom");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
