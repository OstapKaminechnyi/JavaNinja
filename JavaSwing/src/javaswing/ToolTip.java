package javaswing;

import javax.swing.*;

public class ToolTip {
    public static void main(String a[]){
        JFrame frame = new JFrame("Password Tool Tip");
        JPasswordField field = new JPasswordField();
        field.setBounds(100,100,100,30);
        field.setToolTipText("Enter Your Password");
        JLabel label1 = new JLabel("Password");
        label1.setBounds(20,100,80,30);

        frame.add(field);
        frame.add(label1);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
