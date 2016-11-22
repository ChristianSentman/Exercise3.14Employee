import sun.applet.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;
/**
 * Created by Christian on 11/21/2016.
 */

public class MainDisplay extends JPanel {

    Ball theBall;
    Brick theBrick;
    ArrayList<ArrayList<Brick>> theBricks;

    public void showBrick(int r, int c) {

    }
    public MainDisplay(int r, int c) {
        int count = 0;
        Brick[][] Bricks = new Brick[5][5];


        private void theBricks
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

            }


        }

    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        if (theBall.DIE()) {
            g.drawString("Game Over Man", 200, 250);}

        // draw the ball at the current position
        g.fillOval(theBall.getX(), theBall.getY(), theBall.getDiameter(), theBall.getDiameter());
        g.fillRect(theBrick.brickGetX(), theBrick.brickGetY(), theBrick.brickGetWidth(), theBrick.brickGetLength());



    }

    public void animate()  {

        theBall.move();

    }
    public void Bounce() {
        theBall.Bounce();
    }
    public void DIE() { theBall.DIE(); }

    public MainDisplay() {
        super();
        theBall = new Ball(20,20);
        theBrick = new Brick(100, 100);
        theBrick = new Brick(200, 200);


    }



    public static void main(String[] args) throws Exception {
        JFrame theApp = new JFrame();
        MainDisplay theDisplay = new MainDisplay();

        theApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theApp.setSize(500, 500);				// creates window with width=500 and height=500
        theApp.add(theDisplay);
        theApp.setVisible(true);

        // loop forever (well, until the application is closed anyway)
        while (true) {
            theDisplay.animate();
            theDisplay.Bounce();
            theDisplay.DIE();
            theApp.repaint(); 		// trigger the JPanel paintComponent() method to be called
            Thread.sleep(40);		// go to sleep for 20 milliseconds




        }

    }

}
