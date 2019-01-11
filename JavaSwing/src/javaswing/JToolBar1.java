package javaswing;

import javax.swing.*;
import java.awt.*;

public class JToolBar1 extends JFrame {
    JToolBar t1,t2,t3,t4;
    public JToolBar1(){
        createAndShowGUI();
    }
    private void createAndShowGUI(){
        setTitle("JTitle");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        t1 = new JToolBar();
        t2 = new JToolBar(JToolBar.VERTICAL);
        t3 = new JToolBar("Toolbar 3");
        t4 = new JToolBar("Toolbar 4");
        for (int i =1;i<5;i++){
            t1.add(new JButton("Button " + i));
            t1.addSeparator();
            t2.add(new JButton("Button " + i));
            t3.add(new JButton("Button" + i));
            t4.add(new JButton("Button"+i));

        }
        t1.setMargin(new Insets(10,10,10,10));
        t1.setRollover(false);
        t1.setFloatable(false);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String a[]){
        new JToolBar1();
    }
}
