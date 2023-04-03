import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris {
    JFrame frame;
    private JLabel statusbar;

    public Tetris() {
        initUI();
    }

    private void initUI() {
        frame = new JFrame("Tetrissishe!");
        frame.setSize(400, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        statusbar = new JLabel("Score: 0");
        statusbar.setSize(400, 50);
        statusbar.setBackground(Color.BLACK);
        statusbar.setForeground(Color.WHITE);
        statusbar.setOpaque(true);
        frame.add(statusbar, BorderLayout.NORTH);

        var board = new Board(this);

        frame.add(board);
        board.start();

        frame.setVisible(true);
    }

    JLabel getStatusBar() {
        return statusbar;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var game = new Tetris();
        });
    }
}
