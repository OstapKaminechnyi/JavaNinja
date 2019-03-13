package javaswing;

import javax.swing.*;

public class RootPane {
    public static void main(String a[]){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JRootPane rootPane = frame.getRootPane();
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("File");
        bar.add(menu);
        menu.add("Open");
        menu.add("Close");
        rootPane.setJMenuBar(bar);
        rootPane.getContentPane().add(new JButton("Press Me"));
        frame.pack();
        frame.setVisible(true);
    }
}
