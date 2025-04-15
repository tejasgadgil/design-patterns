package org.example;

public interface Moves {
    String move();
}

//This is decoupling

class MovesDiagonal implements Moves{

    @Override
    public String move() {
        return "I move Diagonally";
    }
}

class MovesOneStep implements Moves{

    @Override
    public String move() {
        return "I move One step to the front";
    }
}

class MovesAnyDirection implements Moves{

    @Override
    public String move() {
        return "I move in Any Direction";
    }
}