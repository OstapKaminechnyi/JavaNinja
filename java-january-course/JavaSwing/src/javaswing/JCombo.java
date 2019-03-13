package javaswing;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JCombo {
    public static void main(String[] a){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jButton1 = new JButton("Button");

        String[] myString = {"Java", "JBuilder", "JFC", "Swing"};
        final JList jList1 = new JList(myString);
        jButton1.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                Object contents = jList1.getSelectedValue();
                System.out.print(contents);
            }
        });
        frame.add(jList1,"Center");
        frame.add(jButton1,"South");
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
