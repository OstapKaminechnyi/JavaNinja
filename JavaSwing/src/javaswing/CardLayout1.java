package javaswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayout1 extends JFrame implements ActionListener {
    CardLayout cardLayout;
    JButton button1,button2,button3;
    Container container;
    CardLayout1(){
        container = getContentPane();
        cardLayout = new CardLayout(40,30);
        container.setLayout(cardLayout);

        button1 = new JButton("Apple");
        button2 = new JButton("Girl");
        button3 = new JButton("Dog");
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        container.add("a",button1);
        container.add("b",button2);
        container.add("c",button3);

    }
    public void actionPerformed(ActionEvent event){
        cardLayout.next(container);
    }
    public static void main(String[] a){
        CardLayout1 cardLayout1 = new CardLayout1();
        cardLayout1.setSize(500,600);
        cardLayout1.setVisible(true);
        cardLayout1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
