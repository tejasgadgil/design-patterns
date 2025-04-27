package pizzeria.command;

import pizzeria.models.Pizza;
import pizzeria.strategy.BakingStrategy;

public class BakePizzaCommand implements Command{

    private Pizza pizza;
    private BakingStrategy bakingStrategy;

    public BakePizzaCommand(Pizza pizza, BakingStrategy bakingStrategy){
        this.pizza = pizza;
        this.bakingStrategy = bakingStrategy;
    }

    @Override
    public void execute() {
        System.out.println("\n Baking Pizza");
        bakingStrategy.bake();
        System.out.println("Pizza is baked!");
    }


}
