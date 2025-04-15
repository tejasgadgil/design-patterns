package org.example;

import java.util.Scanner;

public class OrderPizza {
    public static void main(String[] args) {

        System.out.println("Welcome to Tejas's Pizzeria!");
        System.out.println("Please place your Order. Press the number beside the pizza you want to order.");
        System.out.println("MENU \n 1. Veggie Exotica Pizza \n 2. Corn and Cheese Pizza \n 3. Vegan's Special");

        Scanner pizzaOrderNumber = new Scanner(System.in);
        int choice = pizzaOrderNumber.nextInt();
        PizzaBuilder pizzaOrder = null;

        if(choice == 1){
            pizzaOrder = new VeggieExoticaBuilder();
        } else if (choice == 2) {
            pizzaOrder = new CornAndCheeseBuilder();
        } else if (choice == 3) {
            pizzaOrder = new VeganSpecialBuilder();
        } else {
            System.out.println("This pizza is not on our menu yet!");
        }

        if (pizzaOrder != null){
            PizzeriaKitchen pizzeriaKitchen = new PizzeriaKitchen(pizzaOrder);
            pizzeriaKitchen.makePizza();
            Pizza yourPizza = pizzeriaKitchen.getPizza();

            System.out.println("Your Pizza base is " + yourPizza.getPizzaBase());
            System.out.println("Your Pizza sauce is " + yourPizza.getPizzaSauce());
            System.out.println("Your Pizza cheese is " + yourPizza.getPizzaCheese());
            System.out.println("Your Pizza toppings is " + yourPizza.getPizzaToppings());

        }

        System.out.println("Thanks for visiting!");

    }
}