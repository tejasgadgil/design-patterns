package pizzeria.ui;

import java.util.List;
import java.util.Scanner;

import pizzeria.models.Pizza;
import pizzeria.builders.PizzaBuilder;

public class ConsoleUI {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayOrder(List<String> toppingsList){
        System.out.println("\nCustomer wants a pizza with:");
        for (String topping : toppingsList) {
            System.out.println("- " + topping);
        }
        System.out.println("REMEMBER THIS!");
        System.out.println("(Press Enter when ready to build the pizza)");
        scanner.nextLine();
    }

    public static Pizza buildPizza() {
        PizzaBuilder builder = new PizzaBuilder();
        builder.addSauce().addCheese(); // Always basic

        System.out.println("\nBuild your pizza by typing toppings one by one.");
        System.out.println("Type 'done' when finished.");

        while (true) {
            System.out.print("Add topping: ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            builder.addTopping(input);
        }

        return builder.build();
    }

    public static <expectedPrice> void displayResult(List<String> expectedToppingsList, List<String> actualToppingsList,  double expectedPrice, double actualPrice){
        System.out.println("\n--- RESULT ---");
        System.out.println("Expected: " + expectedToppingsList);
        System.out.println("Your Pizza: " + actualToppingsList);

        int matches = 0;
        double priceDifference = 0;

        // Compare toppings and calculate price difference
        for (String topping : expectedToppingsList) {
            if (actualToppingsList.contains(topping)) {
                matches++;
                priceDifference += getToppingPrice(topping);
            } else {
                priceDifference -= getToppingPrice(topping);
            }
        }
        System.out.println("Correct toppings: " + matches + "/" + expectedToppingsList.size());
        System.out.println("Pizza Price: $" + actualPrice);
        System.out.println("Expected Price: $" + expectedPrice);

        double tip = 0;
        if (matches == expectedToppingsList.size()) {
            tip = actualPrice * 0.25; // 25% tip
            System.out.println("Perfect Pizza! Tip: $" + tip);
        } else if (matches >= expectedToppingsList.size() / 2) {
            tip = actualPrice * 0.10; // 10% tip
            System.out.println("Okay Pizza. Tip: $" + tip);
        } else {
            System.out.println("Terrible Pizza. No Tip.");
        }


    }

    private static double getToppingPrice(String topping) {
        switch (topping.toLowerCase()) {
            case "tomato": return 2.0;
            case "onion": return 5.0;
            case "capsicum": return 7.0;
            case "mushroom": return 3.0;
            default: return 0.0;
        }
    }
}
