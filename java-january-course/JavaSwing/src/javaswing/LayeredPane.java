package javaswing;

import javax.swing.*;
import java.awt.*;

public class LayeredPane extends JFrame {
    public LayeredPane(){
        super("Layered Pane Example");
        setSize(200,200);
        JLayeredPane pane = getLayeredPane();

        JButton top = new JButton();
        top.setBackground(Color.WHITE);
        top.setBounds(20,20,50,50);

        JButton middle = new JButton();
        top.setBackground(Color.red);
        top.setBounds(40,40,50,50);

        JButton bottom = new JButton();
        top.setBackground(Color.blue);
        top.setBounds(60,60,50,50);

        pane.add(bottom, Integer.valueOf(1));
        pane.add(bottom, Integer.valueOf(2));
        pane.add(bottom, Integer.valueOf(3));

    }
    public static void main(String[] a){
        LayeredPane panel = new  LayeredPane();
        panel.setVisible(true);

    }
}
