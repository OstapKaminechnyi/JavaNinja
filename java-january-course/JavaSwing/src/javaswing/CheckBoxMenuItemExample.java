package javaswing;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class CheckBoxMenuItemExample {
    public static void main(final String[] a){
        JFrame frame = new JFrame("Simple Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
        fileMenu.add(newMenuItem);

        JCheckBoxMenuItem caseMenuItem = new JCheckBoxMenuItem("Case Sensitive");
        caseMenuItem.setMnemonic(KeyEvent.VK_C);
        fileMenu.add(caseMenuItem);
        frame.setJMenuBar(menuBar);
        frame.setSize(350,400);
        frame.setVisible(true);
    }
}
