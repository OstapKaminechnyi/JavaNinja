package javaswing;

import javax.swing.*;

public class ScrollPaneLayout1 extends JFrame {
    public ScrollPaneLayout1(){
        super("ScrollPaneLayout");
        ImageIcon imageIcon = new ImageIcon("D:\\Repo\\JavaNinja\\workspace\\JavaSwing\\src\\javaswing\\Scrapy-Logo-big.png");
        JScrollPane pane = new JScrollPane(new JLabel(imageIcon));
        getContentPane().add(pane);
        setSize(300,300);
        setVisible(true);

    }
    public static void main(String a[]){
        new ScrollPaneLayout1();
    }
}
