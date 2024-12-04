package eu.frezilla.cheesbox.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

@Data
public final class Colors {

    @Getter(AccessLevel.NONE) private final Set<ChessMan> chessManSet;
    private final Color color;

    public Colors(Color color) {
        this.chessManSet = new HashSet<>();
        this.color = color;
    }

    public boolean add(ChessMan chessMan) {
        if (!this.color.equals(chessMan.getColor())) throw new AssertionError();
        return chessManSet.add(Objects.requireNonNull(chessMan));
    }

    private boolean between(long value, long min, long max) {
        return (value >= min && value <= max);
    }

    private long countPieces(Type type) {
        return chessManSet.stream().filter(cm -> type.equals(cm.getType())).count();
    }

    public boolean check() {
        return !((chessManSet.isEmpty())
                || (chessManSet.size() > 16)
                || (countPieces(Type.King) != 1)
                || (!between(countPieces(Type.Bishop), 0, 10))
                || (!between(countPieces(Type.Knight), 0, 10))
                || (!between(countPieces(Type.Pawn), 0, 8))
                || (!between(countPieces(Type.Queen), 0, 9))
                || (!between(countPieces(Type.Rook), 0, 10)));
    }

    public boolean isInitial() {
        return (chessManSet.size() == 16
                && (countPieces(Type.King) == 1)
                && (countPieces(Type.Bishop) == 2)
                && (countPieces(Type.Knight) == 2)
                && (countPieces(Type.Pawn) == 8)
                && (countPieces(Type.Queen) == 1)
                && (countPieces(Type.Rook) == 2));
    }
    
    public Iterable<ChessMan> toIterable() {
        return () -> chessManSet.iterator();
               
    }

}
