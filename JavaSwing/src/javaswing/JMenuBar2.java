package javaswing;

import javax.swing.*;

public class JMenuBar2 {
    JMenu menu, submenu;
    JMenuItem i1,i2,i3,i4,i5;

    JMenuBar2(){
        JFrame f = new JFrame("Menu and MenuItem");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("File");
        submenu = new JMenu("Edit");
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Open File");
        i4 = new JMenuItem("Save");
        i5 = new JMenuItem("Save As");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i4);
        menu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String a[]){
        new JMenuBar2();
    }
}
