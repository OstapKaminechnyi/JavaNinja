package javaswing;


import javax.swing.*;

public class OptionPane1 {
    JFrame f;
    OptionPane1(){
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Successfully Updated Record","Alert",JOptionPane.WARNING_MESSAGE);
    }
    public static void main(String a[]){
        new OptionPane1();
    }
}
