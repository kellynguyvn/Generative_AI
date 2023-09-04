import java.awt.Graphics;
import java.awt.Color;

public class Paddle {
    private int x, y;
    private int speed = 2;
    private int width = 20, height = 80;
    private int id;

    public Paddle(int x, int y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

        // Implement paddle movement logic here
        public void update(){
            if(id == 1){
                if(GamePanel.w){
                    moveUp();
                }
                if(GamePanel.s){
                    moveDown();
                }
            }
            else if(id == 2){
                if(GamePanel.up){
                    moveUp();
                }
                if(GamePanel.down){
                    moveDown();
                }
            }
        }
    

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
    }

    public void moveUp() {
        y -= speed;
    }

    public void moveDown() {
        y += speed;
    }
}
