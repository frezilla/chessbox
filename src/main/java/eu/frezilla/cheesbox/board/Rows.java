package eu.frezilla.cheesbox.board;

import lombok.Getter;

public enum Rows {
    UN(1),
    DEUX(2),
    TROIS(3),
    QUATRE(4),
    CINQ(5),
    SIX(6),
    SEPT(7),
    HUIT(8);
    
    @Getter private final int index;
    
    private Rows(int index) {
        this.index = index;
    }
}
