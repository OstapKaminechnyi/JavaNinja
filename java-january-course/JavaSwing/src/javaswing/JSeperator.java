package javaswing;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class JSeperator {
    public static void main(String a[]){
        JFrame frame = new JFrame("Menu Simple Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
        fileMenu.add(newMenuItem);

        fileMenu.addSeparator();
        JMenuItem saveMenuItem = new JMenuItem("Save", KeyEvent.VK_S);
        fileMenu.add(saveMenuItem);

        frame.setJMenuBar(menuBar);
        frame.setSize(350,250);
        frame.setVisible(true);
    }
}
