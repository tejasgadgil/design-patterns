package org.example;

public class CornAndCheeseBuilder implements PizzaBuilder{
    private Pizza pizza;

    public CornAndCheeseBuilder(){
        this.pizza = new Pizza();
    }

    @Override
    public void buildPizzaBase() {
        pizza.setPizzaBase("Medium Crust");
    }

    @Override
    public void buildPizzaSauce() {
        pizza.setPizzaSauce("Simple Tomato Sauce");
    }

    @Override
    public void buildPizzaCheese() {
        pizza.setPizzaCheese("Shredded Cheese");
    }

    @Override
    public void buildPizzaToppings() {
        pizza.setPizzaToppings("Corn");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
