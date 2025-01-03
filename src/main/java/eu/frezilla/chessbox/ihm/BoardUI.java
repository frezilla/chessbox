package eu.frezilla.chessbox.ihm;

import eu.frezilla.chessbox.board.Board;
import eu.frezilla.chessbox.board.Square;
import eu.frezilla.chessbox.board.SquareColor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class BoardUI extends JPanel {
    
    private final static Color DARK = new Color(78, 104, 101);
    private final static Color LIGHT = Color.WHITE;
    
    private final Board board;
    
    public BoardUI(Board board) {
        this.board = Objects.requireNonNull(board);
        
        initialize();
    }
    
    private JLabel addSquare(SquareColor color) {
        JLabel jLabel = new JLabel("");
        jLabel.setBorder(BorderFactory.createLineBorder(SquareColor.Dark.equals(color) ? DARK : LIGHT));
        jLabel.setBackground(SquareColor.Dark.equals(color) ? DARK : LIGHT);
        jLabel.setOpaque(true);
        jLabel.setPreferredSize(new Dimension(96, 96));
        return jLabel;
    }
    
    private void initialize() {
        int nbRows = board.getRows();
        int nbCols = board.getCols();
        
        setLayout(new GridLayout(nbRows, nbCols));
        
        for (int row = 0; row < nbRows; row++) {
            for (int col = 0; col < nbCols; col++) {
                Square square = board.at(row, col);
                SquareColor color = square.getColor();
                add(addSquare(color));
            }
        }
    }
    
    

    

    
}
