package javaswing;

import javax.swing.*;
import java.awt.*;

public class BorderLayout1 {
    JFrame jFrame;
    BorderLayout1(){
        jFrame = new JFrame();
        JButton button1 = new JButton("NORTH");
        JButton button2 = new JButton("SOUTH");

        JButton button3 = new JButton("EAST");
        JButton button4 = new JButton("WEST");
        JButton button5 = new JButton("CENTER");

        jFrame.add(button1, BorderLayout.NORTH);
        jFrame.add(button2,BorderLayout.SOUTH);

        jFrame.add(button3,BorderLayout.EAST);
        jFrame.add(button4,BorderLayout.WEST);
        jFrame.add(button5,BorderLayout.CENTER);

        jFrame.setSize(300,300);
        jFrame.setVisible(true);

    }

    public static void main(String[] a){
        new BorderLayout1();
    }
}
