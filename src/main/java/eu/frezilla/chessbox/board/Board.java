package eu.frezilla.chessbox.board;

public final class Board {

    private final Square[][] board;
    private final int height;
    private final int width;

    public Board() {
        width = Columns.values().length;
        height = Rows.values().length;

        board = new Square[height][width];

        boolean createDarkSquare = true;
        for (Rows row : Rows.values()) {
            for (Columns column : Columns.values()) {
                
                board[row.getIndex()][column.getIndex()] = 
                        new Square(
                                createDarkSquare ? SquareColor.Dark : SquareColor.Light, 
                                new Position(column, row)
                        );
                createDarkSquare = !createDarkSquare;
            }
        }
    }

}
