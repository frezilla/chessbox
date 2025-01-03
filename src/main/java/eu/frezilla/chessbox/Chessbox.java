package eu.frezilla.chessbox;

import eu.frezilla.chessbox.board.Board;
import eu.frezilla.chessbox.ihm.ChessBoxUI;
import eu.frezilla.chessbox.set.ChessMan;
import eu.frezilla.chessbox.set.Pieces;

public class Chessbox {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Pieces pieces = new Pieces();
        
        for (ChessMan chessMan : pieces.getBlackPieces().toIterable()) {
            System.out.print(chessMan + " ");
        }
        System.out.println("");
        for (ChessMan chessMan : pieces.getWhitePieces().toIterable()) {
            System.out.print(chessMan + " ");
        }
        
        new ChessBoxUI(new Board());
    }
}
