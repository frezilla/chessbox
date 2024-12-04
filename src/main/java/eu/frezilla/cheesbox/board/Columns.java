package eu.frezilla.cheesbox.board;

import lombok.Getter;

public enum Columns {
    A(1),
    B(2),
    C(3),
    D(4),
    E(5),
    F(6),
    G(7),
    H(8);

    @Getter private final int index;    
    
    private Columns(int index) {
        this.index = index;
    }
}
