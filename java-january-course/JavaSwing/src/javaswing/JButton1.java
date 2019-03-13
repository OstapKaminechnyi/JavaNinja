package javaswing;

import javax.swing.*;

public class JButton1 {
    JButton1(){
        JFrame frame = new JFrame();
        JButton b = new JButton("Click me");
        b.setBounds(50,50,90,250);
        frame.add(b);
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] a){
        new JButton1();
    }
}
