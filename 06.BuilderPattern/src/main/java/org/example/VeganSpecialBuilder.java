package org.example;

public class VeganSpecialBuilder implements PizzaBuilder{
    private Pizza pizza;

    public VeganSpecialBuilder(){
        this.pizza = new Pizza();
    }

    @Override
    public void buildPizzaBase() {
        pizza.setPizzaBase("Thin Crust");
    }

    @Override
    public void buildPizzaSauce() {
        pizza.setPizzaSauce("Simple Tomato Sauce");
    }

    @Override
    public void buildPizzaCheese() {
        pizza.setPizzaCheese("No cheese");
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
