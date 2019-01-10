package javaswing;

import javax.swing.*;

public class JTextArea1 {
    JTextArea1(){
        JFrame f = new JFrame();
        JTextArea area = new JTextArea("Welcome");
        area.setBounds(10,30,200,200);
        f.add(area);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[]a){
        new JTextArea1();
    }
}
