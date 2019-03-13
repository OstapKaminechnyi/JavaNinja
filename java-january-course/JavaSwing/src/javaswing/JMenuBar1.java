package javaswing;

import javax.swing.*;

public class JMenuBar1 extends JFrame {
    private JMenuBar menubar = new JMenuBar();
    public JMenuBar1(String title){
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(menubar);
        JMenu fileMenu = new JMenu("File");
        JMenu  edit = new JMenu("Edit");
        JMenu source = new JMenu("Source");
        menubar.add(fileMenu);
        menubar.add(edit);
        menubar.add(source);

    }
    public static void main(String a[]){
        JMenuBar1 window = new JMenuBar1("IDEA");
        window.setBounds(30,30,300,300);
        window.setVisible(true);

    }
}
