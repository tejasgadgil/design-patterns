package org.example;

public class Pizza implements PizzaPlan{

    private String pizzaBase;
    private String pizzaSauce;
    private String pizzaCheese;
    private String pizzaToppings;

    @Override
    public void setPizzaBase(String base) {
        this.pizzaBase = base;
    }

    @Override
    public void setPizzaSauce(String sauce) {
        this.pizzaSauce = sauce;
    }

    @Override
    public void setPizzaCheese(String cheese) {
        this.pizzaCheese = cheese;
    }

    @Override
    public void setPizzaToppings(String toppings) {
        this.pizzaToppings = toppings;
    }

    public String getPizzaBase() {
        return pizzaBase;
    }

    public String getPizzaToppings() {
        return pizzaToppings;
    }

    public String getPizzaCheese() {
        return pizzaCheese;
    }

    public String getPizzaSauce() {
        return pizzaSauce;
    }
}
