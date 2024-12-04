package eu.frezilla.cheesbox.board;

public final class Board {
    
    private final Square[][] board;
    
    public Board() {
        board = new Square[Columns.values().length][Rows.values().length];
    }
    
    
}
