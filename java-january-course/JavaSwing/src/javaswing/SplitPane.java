package javaswing;

import javax.swing.*;
import java.awt.*;

public class SplitPane {
    private static void createAndShow(){
        final JFrame jFrame = new JFrame("Split");
        jFrame.setSize(300,300);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().setLayout(new FlowLayout());
        String[] option1 = {"a","b","c","d","e"};
        JComboBox box1 = new JComboBox(option1);
        String[] option2 = {"1","2","3","4","5"};
        JComboBox box2 = new JComboBox(option2);
        Panel panel1 = new Panel();
        panel1.add(box1);
        Panel panel2 = new Panel();
        panel2.add(box2);
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panel1,panel2);
        jFrame.getContentPane().add(splitPane);
    }
    public static void main(String[] a){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShow();
            }
        });
    }

}
