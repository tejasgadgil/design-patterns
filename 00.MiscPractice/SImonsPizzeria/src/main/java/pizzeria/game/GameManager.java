package pizzeria.game;

public class GameManager {

    private static GameManager instance;

    private GameManager(){
        // private constructor
    }

    public static GameManager getInstance(){
        if (instance == null){
            instance = new GameManager();
        }
        return instance;
    }

    public void startGame(){
        // TODO: start game logic
    }

}
