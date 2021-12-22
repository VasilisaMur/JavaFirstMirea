package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Test1 extends JFrame{
    Random random = new Random();
    public Test1() {
        super("Test");
        setLayout(null);
        setSize(1600,900);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        for( int i=0;i<20;i++){
            int R = random.nextInt(256);
            int G = random.nextInt(256);
            int B = random.nextInt(256);
            int x = random.nextInt(800);
            int y = random.nextInt(600);
            int f = random.nextInt(2);
            switch(f){
                case 0: {
                    Rectangle r = new Rectangle( x, y, i * 10, i * 20, new Color(R,G,B));
                    g.setColor(r.getColor());
                    g.drawRect((int) r.getX(), (int) r.getY(), r.getLength(), r.getWidth());
                    break;
                }
                case 1:{
                    Circle c = new Circle(x,y,(int)(Math.random()*100),new Color(R,G,B));
                    g.setColor(c.getColor());
                    g.drawOval((int) c.getX(), (int) c.getY(), c.getRadius(), c.getRadius());
                    break;
                }
                default: break;
            }
        }
    }


    public static void main(String[] args)
    {
        Test1 frame = new Test1();
    }
}
