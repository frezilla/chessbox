package eu.frezilla.chessbox.board;

import java.util.Objects;

public final class Square {
    
    private final SquareColor color;
    private final Position position;
    
    Square(SquareColor color, Position position) {
        this.color = Objects.requireNonNull(color);
        this.position = Objects.requireNonNull(position);
    }
    
    
}
