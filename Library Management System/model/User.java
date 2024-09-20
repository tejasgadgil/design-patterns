package model;

public abstract class User {
    private String name;
    private String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void showRole();

    public void update(Book book){
        if (book.getAvailable()){
            System.out.println("Notification: " + name + ", the book " + book.getTitle() + " is now available.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        this.id = String.valueOf(id);
    }
}

