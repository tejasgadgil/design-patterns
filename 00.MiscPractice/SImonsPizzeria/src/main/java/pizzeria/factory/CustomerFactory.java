package pizzeria.factory;

import pizzeria.builders.PizzaBuilder;
import pizzeria.models.Customer;
import pizzeria.models.Order;
import pizzeria.models.Pizza;

import java.util.Random;

// TODO: using strategy, add behaviour (angry, sarcastic, calm, whimsical, funny)
public class CustomerFactory {

    private static String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
    private static String[] possibleToppings = {"Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon", "Extra Cheese"};

    private static Random random = new Random();

    public static Customer createCustomer(){
        String name = names[random.nextInt(names.length)];

        PizzaBuilder builder = new PizzaBuilder();
        builder.addSauce().addCheese();

        int numberOfToppings = random.nextInt(3) + 1;

        for (int i = 0; i < numberOfToppings; i++){
            String topping = possibleToppings[random.nextInt(possibleToppings.length)];
            builder.addTopping(topping);
        }

        Pizza pizza = builder.build();
        Order order = new Order(pizza);

        return new Customer(name, order);
    }
}
