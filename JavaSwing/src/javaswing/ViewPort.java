package javaswing;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ViewPort {
    public static void main(String[] a){
        JFrame frame= new JFrame("View Port");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Label");
        label.setPreferredSize(new Dimension(1000,1000));
        JScrollPane jScrollPane = new JScrollPane(label);
        JButton jButton1 = new JButton();
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        jScrollPane.setViewportBorder(new LineBorder(Color.red));
        jScrollPane.getViewport().add(jButton1,null);
        frame.add(jScrollPane,BorderLayout.CENTER);
        frame.setSize(400,150);
        frame.setVisible(true);

    }
}
