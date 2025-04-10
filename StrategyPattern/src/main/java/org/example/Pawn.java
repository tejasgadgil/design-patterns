package org.example;

public class Pawn extends ChessPiece{

    public Pawn(){
        super();

        setScore(1);

        movementType = new MovesOneStep();
    }

    public void firstMove(){
        System.out.println("First move");
    }
}
