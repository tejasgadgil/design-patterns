package model;

public class UserFactory {
    public static User createUser(String type, String name, String id){
        if(type.equalsIgnoreCase("Librarian")) {
            return new Librarian(name, id);
        } else if (type.equalsIgnoreCase("Member")) {
            return new Member(name, id);
        }
        return null;

    }
}
