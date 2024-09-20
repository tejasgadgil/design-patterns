package model;

public class Member extends User{

    public Member(String name, String id) {
        super(name, id);
    }

    @Override
    public void showRole() {
        System.out.println("Member: "+ getName());
    }

    public void borrowBook(Book book){

    }

    public void returnBook(Book book){

    }
}
