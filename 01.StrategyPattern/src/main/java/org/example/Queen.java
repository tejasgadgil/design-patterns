package org.example;

public class Queen extends ChessPiece{

    public Queen(){

        super();

        setScore(9);

        movementType = new MovesAnyDirection();
    }

}
