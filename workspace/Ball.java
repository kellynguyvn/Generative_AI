import java.awt.Graphics;
import java.awt.Color;

public class Ball {
    private int x, y;
    private int speedX = 2, speedY = 2;
    private int size = 20;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update() {
        x += speedX;
        y += speedY;
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, size, size);
    }

    public void reverseX() {
        speedX = -speedX;
    }

    public void reverseY() {
        speedY = -speedY;
    }
}