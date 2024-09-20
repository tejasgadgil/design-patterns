package model;

public class Librarian extends User{

    public Librarian(String name, String id) {
        super(name, id);
    }

    @Override
    public void showRole() {
        System.out.println("Librarian: " + getName());
    }

    public void addBook(Book book){

    }

    public void removeBook(Book book){

    }
}
