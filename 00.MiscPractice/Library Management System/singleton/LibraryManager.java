package singleton;

public class LibraryManager {

    private static LibraryManager instance;

    private LibraryManager(){

    }

    public static LibraryManager getInstance(){
        if (instance == null){
            instance = new LibraryManager();
        }
        return instance;
    }


}
