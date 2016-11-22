import javax.swing.*;
/**
 * Created by Christian on 11/21/2016.
 */
public class Ball {
    private int x, y;		// (x,y) position of the top left corner of the ball
    private int diameter;
    private int dx, dy; 	// direction & amount to change when moving, dx for x-axis and dy for y-axis

    public Ball(int startingX, int startingY) {
        x = startingX;
        y = startingY;
        diameter = 30;
        dx = 30;
        dy = 10;

    }

    // move the ball's center along both axes
    public void move() {
        x += dx;
        y += dy;
    }

    // return the current x-axis coordinate of the top left corner of the ball
    public int getX() {
        return x;
    }

    // return the current y-axis coordinate of the top left corner of the ball
    public int getY() {
        return y;
    }

    // return the diameter of the ball
    public int getDiameter() {
        return diameter;
    }

    public void Bounce() {
        if (dx + x >= 465 || dx + x <= 0) {
            dx = -dx;
        }else{
            if ( dy + y <= 0) {
                dy = -dy;
            }
        }

    }
    public boolean DIE() {
        if (dy + y >= 465) {
            return true;

        }else{
            return false;
        }
    }
    public void gameOver() {
        if (dy + y >= 465) {


        }
    }
}

