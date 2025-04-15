package org.example;

public class Main {
    public static void main(String[] args) {

        ChessPiece whitePawn1 = new Pawn();
        ChessPiece whiteQueen = new Queen();

        System.out.println("Pawn: " + whitePawn1.TryToMove());
        System.out.println("Queen: " + whiteQueen.TryToMove());

        System.out.println("pawn promotion");
        whitePawn1.setMovementType(new MovesAnyDirection());

        System.out.println("Pawn: " + whitePawn1.TryToMove());
        System.out.println("Queen: " + whiteQueen.TryToMove());
    }
}