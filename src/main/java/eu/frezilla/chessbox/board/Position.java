package eu.frezilla.chessbox.board;

import java.util.Objects;
import lombok.Data;

@Data
public final class Position {
    
    private final Columns column;
    private final Rows row;
    
    public Position(Columns column, Rows row) {
        this.column = Objects.requireNonNull(column);
        this.row = Objects.requireNonNull(row);
    }
    
    public int getColumnIndex() {
        return column.getIndex();
    }
    
    public int getRowIndex() {
        return row.getIndex();
    }
    
    
    
}
