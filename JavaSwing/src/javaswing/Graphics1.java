package javaswing;

import javax.swing.*;
import java.awt.*;

public class Graphics1 extends Canvas {
    public void paint(Graphics graphics){
        graphics.drawString("Hello",40,40);
        setBackground(Color.white);
        graphics.fillRect(130,30,100,80);
        graphics.drawOval(30,130,50,60);
        setForeground(Color.red);
        graphics.fillOval(130,130,50,60);

    }
    public static void main(String a[]){
        Graphics1 m = new Graphics1();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
