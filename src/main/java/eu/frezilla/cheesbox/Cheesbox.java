package eu.frezilla.cheesbox;

import eu.frezilla.cheesbox.set.ChessMan;
import eu.frezilla.cheesbox.set.Pieces;

public class Cheesbox {

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
    }
}
