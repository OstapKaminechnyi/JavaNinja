package javaswing;

import javax.swing.*;

public class JComp1 {
    public static void main(String a[]){
        JComponent1 comm = new JComponent1();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("JComponents");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comm);
        frame.setVisible(true);
    }
}
