import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer.*;
public class Starfield extends JFrame implements Runnable, KeyListener
{
    Container con = getContentPane();
    Thread t = new Thread(this);
    int exampleInteger = 0;
    boolean exampleBoolean=true;
    boolean isPaused = true;
    int[] skyOfStarsX = new int[100], skyOfStarsY = new int[100]; // initialize the sky of stars
    Image exampleImage;
    Image exampleSplash;
    public Starfield()
    {
        addKeyListener(this);

        con.setLayout(new FlowLayout());
        t.start();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode()==38)//up
        {
        }
        if(e.getKeyCode()==40)//down
        {
        }
        if(e.getKeyCode()==39)//right
        {
        }
        if(e.getKeyCode()==37)//left
        {
        }

        if(e.getKeyCode()==87)//w
        {
        }
        if(e.getKeyCode()==83)//s
        {
        }
        if(e.getKeyCode()==68)//d
        {
        }
        if(e.getKeyCode()==65)//a
        {
        }
        if(e.getKeyCode()==32)//space
        {
        }
        if(e.getKeyCode()==70)//f
        {
        }
    }

    public void keyReleased(KeyEvent e)
    {

    }

    public void keyTyped(KeyEvent e)
    {

    }

    public void run()
    {
        for(int i=0; i<skyOfStarsX.length-1; i++){
            skyOfStarsX[i] = (int)(1000*Math.random());
        }

        for(int ii=0; ii<skyOfStarsY.length-1; ii++){
            skyOfStarsY[ii] = (int)(1000*Math.random());
        }

        try{
            while(true)
            {
                t.sleep(100);
                repaint();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void paint(Graphics gr)
    {
        Image i=createImage(getSize().width, getSize().height);
        Graphics2D g2 = (Graphics2D)i.getGraphics();
        g2.setColor(new Color(0,0,0)); // this creates our black background

        g2.fillRect(0,0,1000,1000);

        g2.setColor(new Color(255,255,255));
        for(int index=0; index<skyOfStarsX.length-1; index++){
            g2.fillRect(skyOfStarsX[index], skyOfStarsY[index], 1, 1);
        }


        Graphics2D g3 = (Graphics2D)i.getGraphics();
        g2.dispose();
        gr.drawImage(i, 0, 0, this);
    }

    public static void main(String[] args)
    {
        Starfield frame = new Starfield();
        frame.setSize(1000, 650);
        frame.setVisible(true);
    }

    public void update(Graphics g)
    {
        paint(g);
    }
}