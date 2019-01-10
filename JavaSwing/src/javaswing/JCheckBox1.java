package javaswing;

import javax.swing.*;

public class JCheckBox1 {
    JCheckBox1(){
        JFrame f = new JFrame("Checkbox Code");
        JCheckBox checkBox1 = new JCheckBox("JAVA");
        checkBox1.setBounds(100,100,50,50);

        JCheckBox checkBox2 = new JCheckBox("C++",true);
        checkBox2.setBounds(100,100,50,50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.setSize(400,400);
        f.setLayout(null);

    }
    public static void main(String[] a){
        new JCheckBox1();

    }
}
