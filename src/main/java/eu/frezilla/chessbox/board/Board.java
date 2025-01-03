package eu.frezilla.chessbox.board;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

@Data
public final class Board {

    @Getter(AccessLevel.NONE) private final Square[][] board;
    private final int rows;
    private final int cols;

    public Board() {
        cols = Columns.values().length;
        rows = Rows.values().length;

        board = new Square[rows][cols];

        boolean createDarkSquare = true;
        int nbRows = Rows.values().length;
        for (Rows row : Rows.values()) {
            for (Columns column : Columns.values()) {
                
                int rowIndex = nbRows + 1 - row.getIndex();
                
                board[rowIndex - 1][column.getIndex() - 1] = 
                        new Square(
                                createDarkSquare ? SquareColor.Dark : SquareColor.Light, 
                                new Position(column, row)
                        );
                createDarkSquare = !createDarkSquare;
            }
            createDarkSquare = !createDarkSquare;
        }
    }
    
    public Square at(int row, int col) {
        if (row < 0 || row > rows || col < 0 || col > cols) throw new ArrayIndexOutOfBoundsException();
        return board[row][col];
    }

}
