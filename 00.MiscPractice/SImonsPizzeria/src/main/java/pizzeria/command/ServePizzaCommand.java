package pizzeria.command;

import pizzeria.models.Order;
import pizzeria.models.Pizza;
import pizzeria.ui.ConsoleUI;

import java.util.List;

public class ServePizzaCommand implements Command{

    private Order order;
    private Pizza playerPizza;

    public ServePizzaCommand(Order order, Pizza playerPizza){
        this.order = order;
        this.playerPizza = playerPizza;
    }

    @Override
    public void execute() {
        // Compare expected vs actual toppings
        double customerPizzaPrice = calculatePrice(order.getExpectedPizza());
        double playerPizzaPrice = playerPizza.getPrice();

        ConsoleUI.displayResult(order.getExpectedPizza().getToppingsList(), playerPizza.getToppingsList(), customerPizzaPrice, playerPizzaPrice);
    }

    private double calculatePrice(Pizza pizza) {
        return pizza.getPrice();
    }


}