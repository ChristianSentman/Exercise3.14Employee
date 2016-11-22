import javax.swing.*;
/**
 * Created by Christian on 11/21/2016.
 */
public class Brick extends JPanel {

    private int x,y;
    private int length,width;




    public Brick(int startingX, int startingY) {
        startingX = x;
        startingY = y;
        length = 60;
        width = 40;




    }
    public int brickGetX() {
        return x;
    }
    public int brickGetY() {
        return y;
    }
    public int brickGetLength() {
        return length;
    }
    public int brickGetWidth() {
        return width;
    }


}
