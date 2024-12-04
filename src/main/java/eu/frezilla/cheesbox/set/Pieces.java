package eu.frezilla.cheesbox.set;

import lombok.Data;

@Data
public final class Pieces {
    
    private final Colors blackPieces;
    private final Colors whitePieces;
    
    public Pieces() {
        blackPieces = new Colors(Color.Black);
        whitePieces = new Colors(Color.White);
        
        initColorPieces(blackPieces, Color.Black);
        initColorPieces(whitePieces, Color.White);
    }
    
    private void addChessMan(Colors colorPieces, Color color, ExtendedType extendedType, int nb) {
        for (int i = 0; i < nb; i++) {
            colorPieces.add(extendedType.build(color));
        }
    }

    private void initColorPieces(Colors colorPieces, Color color) {
        addChessMan(colorPieces, color, ExtendedType.King, 1);
        addChessMan(colorPieces, color, ExtendedType.Queen, 1);
        addChessMan(colorPieces, color, ExtendedType.Rook, 2);
        addChessMan(colorPieces, color, ExtendedType.Bishop, 2);
        addChessMan(colorPieces, color, ExtendedType.Knight, 2);
        addChessMan(colorPieces, color, ExtendedType.Pawn, 8);
        
        if (!colorPieces.isInitial()) {
            throw new AssertionError();
        }
    }
    
}
