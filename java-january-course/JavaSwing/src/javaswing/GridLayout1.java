package javaswing;

import javax.swing.*;
import java.awt.*;

public class GridLayout1 {
    JFrame frame;
    GridLayout1(){
        frame = new JFrame();
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);

        frame.setLayout(new GridLayout(3,3));
        frame.setSize(300,300);
        frame.setVisible(true);



    }
    public static void main(String a[]){
        new GridLayout1();
    }
}
