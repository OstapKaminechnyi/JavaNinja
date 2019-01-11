package javaswing;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;
import java.awt.*;

public class JToggleButton2 extends JFrame {
    JToggleButton t1,t2,t3,t4,t5,t6,t7,t8;
    ImageIcon i1,i2,i3,i4,i5,i6,i7;
    public JToggleButton2(){
        createAndShowGUI();
    }
    private void createAndShowGUI(){
        setTitle("JToggle Button 2");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        i1 = new ImageIcon("D:\\Repo\\JavaNinja\\workspace\\JavaSwing\\src\\javaswing\\1_ipwpqQrHz0Lkd_5setXQCQ.jpeg");
        i2 = new ImageIcon("D:\\Repo\\JavaNinja\\workspace\\JavaSwing\\src\\javaswing\\220px-Kotlin-logo.svg.png");
        i3 = new ImageIcon("D:\\Repo\\JavaNinja\\workspace\\JavaSwing\\src\\javaswing\\246x0w.jpg");
        i4 = new ImageIcon("D:\\Repo\\JavaNinja\\workspace\\JavaSwing\\src\\javaswing\\1200px-Django_logo.svg.png");
        i5 = new ImageIcon("D:\\Repo\\JavaNinja\\workspace\\JavaSwing\\src\\javaswing\\1200px-SQLite370.svg.png");
        i6 = new ImageIcon("D:\\Repo\\JavaNinja\\workspace\\JavaSwing\\src\\javaswing\\docker_facebook_share.png");
        i7 = new ImageIcon("D:\\Repo\\JavaNinja\\workspace\\JavaSwing\\src\\javaswing\\opengraph-icon-200x200.png");

        t1 = new JToggleButton();
        t2= new JToggleButton(new DefaultEditorKit.BeepAction());
        t3= new JToggleButton(i1);

        t4 = new JToggleButton(i2,true);
        t5 = new JToggleButton("Toggle Button 5");
        t6 = new JToggleButton("Toggle Button 6",true);
        t7 = new JToggleButton("Toggle Button 7",i3);
        t8 = new JToggleButton("Toggle Button 8", i4,true);

        t1.setBackground(Color.LIGHT_GRAY);
        t1.setForeground(Color.BLACK);
        t1.setActionCommand("JToggleButton t1");

        t1.setText("Toggle Button 1");
        t2.setText("Toggle Button 2");

        t2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        t4.setRolloverIcon(i5);
        t4.setContentAreaFilled(false);

        t4.setBorderPainted(false);
        t4.setRolloverIcon(i6);

        t4.setSelectedIcon(i7);
        t3.setRolloverEnabled(false);
        t8.setEnabled(false);
        t8.setDisabledSelectedIcon(i6);
        t8.setDisabledIcon(i6);
        t7.setIconTextGap(10);
        t7.setVerticalTextPosition(3);
        t7.setHorizontalTextPosition(SwingConstants.CENTER);

        t7.setFocusPainted(false);
        t7.setBorderPainted(false);
        t7.setContentAreaFilled(false);

        System.out.print("T4 is selected" + t4.isSelected());
        System.out.print("Focus painted for t4 "+ t4.isFocusPainted());

        System.out.print("Border painted for t4 "+ t4.isBorderPainted());

        System.out.print("Focus painted for t4 "+ t4.isContentAreaFilled());
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        add(t8);

        setSize(1000,600);
        setVisible(true);

    }

    public static void main(String[] a){
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new JToggleButton2();
                }
        });
    }
}
