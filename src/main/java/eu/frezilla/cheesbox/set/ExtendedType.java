package eu.frezilla.cheesbox.set;

public enum ExtendedType {
    King(Type.King, "\u265a", "\u2654"),
    Queen(Type.Queen, "\u265b", "\u2655"),
    Rook(Type.Rook, "\u265c", "\u2656"),
    Bishop(Type.Bishop, "\u265d", "\u2657"),
    Knight(Type.Knight, "\u265e", "\u2658"),
    Pawn(Type.Pawn, "\u265f", "\u2659");
    
    private final Type type;
    private final String unicodeValueBlack;
    private final String unicodeValueWhite;
    
    private ExtendedType(Type type, String unicodeValueBlak, String unicodeValueWhite) {
        this.type = type;
        this.unicodeValueBlack = unicodeValueBlak;
        this.unicodeValueWhite = unicodeValueWhite;
    }
    
    public ChessMan build(Color color) {
        if (null == color) {
            return null;
        } else switch (color) {
            case Black:
                return new ChessMan(this.type, color, this.unicodeValueBlack);
            case White:
                return new ChessMan(this.type, color, this.unicodeValueWhite);
            default:
                return null;
        }
    }
}
