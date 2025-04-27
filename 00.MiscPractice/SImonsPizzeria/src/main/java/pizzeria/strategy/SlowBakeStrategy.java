package pizzeria.strategy;

public class SlowBakeStrategy implements BakingStrategy {
    @Override
    public void bake() {
        System.out.println("Using Old Italian Stone Oven...");
        try {
            Thread.sleep(2000); // Slow bake
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pizza baked with love and extreme patience!");
    }
}