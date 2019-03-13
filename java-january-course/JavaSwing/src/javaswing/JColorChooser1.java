package javaswing;

import javax.swing.*;
import java.awt.*;

public class JColorChooser1 extends JFrame {
    public JColorChooser1(){
        createAndShowGUI();
    }
    private void createAndShowGUI(){
        setTitle("JColorChooser1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Color c = JColorChooser.showDialog(this,"Choose a background",Color.red);
        getContentPane().setBackground(c);
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] a){
        new JColorChooser1();
    }
}
