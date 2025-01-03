package eu.frezilla.chessbox.ihm;

import eu.frezilla.chessbox.board.Board;
import javax.swing.JFrame;

public class ChessBoxUI {

    private JFrame jFrame;
    
    public ChessBoxUI(Board board) {
        jFrame = new JFrame();
        
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(new BoardUI(board));
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
