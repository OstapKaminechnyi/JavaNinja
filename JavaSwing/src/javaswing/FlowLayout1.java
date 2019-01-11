package javaswing;

import javax.swing.*;
import java.awt.*;

public class FlowLayout1 {
    JFrame f;
    FlowLayout1(){
        f = new JFrame();

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");

        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.add(button4);
        f.add(button5);

        f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        f.setSize(300,300);
        f.setVisible(true);

    }
    public static void main(String[] a){
        new FlowLayout1();
    }
}
