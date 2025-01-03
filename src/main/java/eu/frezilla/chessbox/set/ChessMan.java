package eu.frezilla.chessbox.set;

import lombok.Data;

@Data
public final class ChessMan {
    
    private final Color color;
    private final long id;
    private final Type type;
    private final String unicodeValue;
    
    public ChessMan(Type type, Color color, String unicodeValue) {
        this.color = color;
        this.id = System.nanoTime();
        this.type = type;
        this.unicodeValue = unicodeValue;
    }
    
    @Override
    public String toString() {
        return this.unicodeValue;
    }
    
}
