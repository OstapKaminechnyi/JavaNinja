package javaswing;

import javax.swing.*;

public class OptionPane {
    JFrame f;
    OptionPane(){
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Hello, welcome to Dialog Box");

    }
    public static void main(String[] a){
        new OptionPane();
    }
}

