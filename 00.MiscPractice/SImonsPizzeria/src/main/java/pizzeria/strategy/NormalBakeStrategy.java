package pizzeria.strategy;


public class NormalBakeStrategy implements BakingStrategy {
    @Override
    public void bake() {
        System.out.println("Using Normal Oven...");
        try {
            Thread.sleep(1000); // 1 second bake
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pizza baked normally!");
    }
}