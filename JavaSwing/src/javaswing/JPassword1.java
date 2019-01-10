package javaswing;

import javax.swing.*;

public class JPassword1 {
    public static void main(String[] a){
        JFrame f= new JFrame("Password Field");
        JPasswordField value = new JPasswordField();
        JLabel l1 = new JLabel("Password");
        value.setBounds(100,100,100,30);
        l1.setBounds(20,100,80,30);
        f.add(value);
        f.add(l1);
        f.setLayout(null);
        f.setVisible(true);
    }
}
