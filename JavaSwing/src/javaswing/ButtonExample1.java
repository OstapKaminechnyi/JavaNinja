package javaswing;

import javax.swing.*;

public class ButtonExample1 {
    ButtonExample1(){
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton(new ImageIcon("D:\\Repo\\JavaNinja\\JavaSwing\\src\\javaswing\\246x0w.jpg"));
        b.setBounds(100,150,500,500);
        f.add(b);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] a){
        new ButtonExample1();
    }
}
