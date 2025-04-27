package pizzeria.game;

import pizzeria.command.BakePizzaCommand;
import pizzeria.command.ServePizzaCommand;
import pizzeria.factory.CustomerFactory;
import pizzeria.models.Customer;
import pizzeria.models.Pizza;
import pizzeria.ui.ConsoleUI;
import pizzeria.strategy.BakingStrategy;
import pizzeria.strategy.NormalBakeStrategy;
import pizzeria.strategy.FastBakeStrategy;
import pizzeria.strategy.SlowBakeStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer customer = CustomerFactory.createCustomer();
        ConsoleUI.displayOrder(customer.getOrder().getExpectedPizza().getToppingsList());

        Pizza playerPizza = ConsoleUI.buildPizza();

        System.out.println("\nChoose oven type:");
        System.out.println("1. Normal Oven");
        System.out.println("2. Fast Oven");
        System.out.println("3. Slow Stone Oven");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        BakingStrategy bakingStrategy;
        switch (choice) {
            case 1 -> bakingStrategy = new NormalBakeStrategy();
            case 2 -> bakingStrategy = new FastBakeStrategy();
            case 3 -> bakingStrategy = new SlowBakeStrategy();
            default -> {
                System.out.println("Invalid choice. Using Normal Oven by default.");
                bakingStrategy = new NormalBakeStrategy();
            }
        }

        // Commands
        BakePizzaCommand bakeCommand = new BakePizzaCommand(playerPizza, bakingStrategy);
        ServePizzaCommand serveCommand = new ServePizzaCommand(customer.getOrder(), playerPizza);

        bakeCommand.execute();
        serveCommand.execute();
    }
}