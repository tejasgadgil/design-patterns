package model;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private Boolean isAvailable;
    private List<User> observers = new ArrayList<>();

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void addObserver(User user){
        observers.add(user);
    }

    public void removeObserver(User user){
        observers.remove(user);
    }

    public void notifyObservers(){
        for(User user : observers) {
            user.update(this);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        this.isAvailable = available;
        notifyObservers();
    }
}
