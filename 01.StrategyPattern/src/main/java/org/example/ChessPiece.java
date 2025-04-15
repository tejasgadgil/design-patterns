package org.example;

public class ChessPiece {

    private String name;
    private int score;
    private String colour;

    //called Composition. Instead on inheriting, class is composed with objects with the right ability
    // allows you to change capability of objects at runtime
    public Moves movementType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String TryToMove(){
        return movementType.move();
    }

    public void setMovementType(Moves newMovementType){
        movementType = newMovementType;
    }
}
