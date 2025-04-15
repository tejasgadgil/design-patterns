package org.example;

public class PizzeriaKitchen {
    private PizzaBuilder pizzaBuilder;

    public PizzeriaKitchen(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza(){
        return this.pizzaBuilder.getPizza();
    }

    public void makePizza(){
        this.pizzaBuilder.buildPizzaBase();
        this.pizzaBuilder.buildPizzaSauce();
        this.pizzaBuilder.buildPizzaCheese();
        this.pizzaBuilder.buildPizzaToppings();
    }
}
