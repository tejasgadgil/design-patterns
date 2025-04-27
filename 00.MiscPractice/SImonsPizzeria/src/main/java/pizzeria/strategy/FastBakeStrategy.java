package pizzeria.strategy;

public class FastBakeStrategy implements BakingStrategy {
    @Override
    public void bake() {
        System.out.println("Using Fast Oven...");
        try {
            Thread.sleep(500); // Faster
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pizza baked quickly!");
    }
}