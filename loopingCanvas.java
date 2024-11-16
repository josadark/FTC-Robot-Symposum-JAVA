import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer.*;
public class loopingCanvas extends JFrame implements Runnable, KeyListener
{
    Container con = getContentPane();
    Thread t = new Thread(this);
    int exampleInteger = 0;
    boolean exampleBoolean=true;
    boolean isPaused = true;
    Image exampleImage;
    Image exampleSplash;
    public loopingCanvas()
    {
        addKeyListener(this);

        //exampleImage= Toolkit.getDefaultToolkit().getImage(getClass().getResource("explosion.gif"));
        //exampleImage= exampleImage.getScaledInstance(200,200,1);

        //exampleSplash= Toolkit.getDefaultToolkit().getImage(getClass().getResource("Instructions.gif"));
        //exampleSplash= exampleSplash.getScaledInstance(1000,650,1);

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
            exampleBoolean = false;
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
        g2.setColor(new Color(213,160,91));


        g2.fillRect(0,0,1000,1000);
        Graphics2D g3 = (Graphics2D)i.getGraphics();
        if(exampleBoolean){
            //g2.drawImage(exampleSplash,0,0,this);
        }
        g2.dispose();
        //gr.drawImage(i, 0, 0, this);
    }

    public static void main(String[] args)
    {
        loopingCanvas frame = new loopingCanvas();
        frame.setSize(1000, 650);
        frame.setVisible(true);
    }

    public void update(Graphics g)
    {
        paint(g);
    }
}