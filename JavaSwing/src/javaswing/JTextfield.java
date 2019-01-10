package javaswing;

import javax.swing.*;

public class JTextfield {
    public static void main(String[] a){
        JFrame f = new JFrame("Text Field");
        JTextField t1,t2;
        t1 = new JTextField("Welcome To My JAVA Course");
        t1.setBounds(50,100,200,30);
        t2 = new JTextField("Swing");
        t2.setBounds(50,150,200,30);
        f.add(t1);
        f.add(t2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
