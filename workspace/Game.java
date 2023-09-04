import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel implements KeyListener, Runnable {
    private static final long serialVersionUID = 1L;
    private Paddle player1, player2;
    private Ball ball;
    private Thread thread;
    private boolean running;
    private int score1, score2;

    public Game() {
        setFocusable(true);
        addKeyListener(this);
        player1 = new Paddle(50, 250, 1);
        player2 = new Paddle(750, 250, 2);
        ball = new Ball(400, 300);
    }

    public void start() {
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        while (running) {
            update();
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void update() {
        player1.update();
        player2.update();
        ball.update();
        checkCollision();
        checkScore();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 800, 600);
        player1.paint(g);
        player2.paint(g);
        ball.paint(g);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.PLAIN, 50));
        g.drawString(String.valueOf(score1), 300, 50);
        g.drawString(String.valueOf(score2), 500, 50);
    }

    public void checkCollision() {
        // Implement collision detection logic here
    }

    public void checkScore() {
        // Implement scoring logic here
    }

    public void keyPressed(KeyEvent e) {
        // Implement key press handling here
    }

    public void keyReleased(KeyEvent e) {
        // Implement key release handling here
    }

    public void keyTyped(KeyEvent e) {
        // This method is not used but is required by the KeyListener interface
    }
}
