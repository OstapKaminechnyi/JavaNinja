package javaswing;

import javax.swing.*;

public class JComboBox1 {
    JFrame f;
    JComboBox1(){
        f = new JFrame("Combo Box");
        String Lang[] = {"C++", "Java", "Python", "R"};
        JComboBox cb = new JComboBox(Lang);
        cb.setBounds(50,50,90,20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400,500);
        f.setVisible(true);

    }
    public static void main(String[] a){
        new JComboBox1();
    }
}
