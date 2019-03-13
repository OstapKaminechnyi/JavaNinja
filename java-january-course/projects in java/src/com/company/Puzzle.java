package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Puzzle extends Frame implements ActionListener {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;

    Puzzle() {
        super("puzzle game");
        button1 = new Button("1");
        button1.setBounds(50, 100, 40, 40);
        button2 = new Button("2");
        button2.setBounds(100, 100, 40, 40);
        button3 = new Button("3");
        button3.setBounds(150, 100, 40, 40);
        button4 = new Button("4");
        button4.setBounds(50, 100, 40, 40);
        button5 = new Button("5");
        button5.setBounds(50, 100, 40, 40);
        button6 = new Button("6");
        button6.setBounds(150, 100, 40, 40);
        button7 = new Button("7");
        button7.setBounds(50, 200, 40, 40);
        button8 = new Button("8");
        button8.setBounds(100, 200, 40, 40);
        button9 = new Button("");
        button9.setBounds(150, 200, 40, 40);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == button1) {
            String label = button1.getLabel();
            if (button2.getLabel().equals("")) {
                button2.setLabel(label);
                button1.setLabel("");
            }
            if (button4.getLabel().equals("")) {
                button4.setLabel(label);
                button3.setLabel("");

            }
        }
        if (event.getSource() == button2) {
            String label = button2.getLabel();
            if (button1.getLabel().equals("")) {
                button1.setLabel(label);
                button2.setLabel("");
            }
            if (button3.getLabel().equals("")) {
                button3.setLabel(label);
                button2.setLabel("");
            }
            if (button5.getLabel().equals("")) {
                button5.setLabel(label);
                button4.setLabel("");
            }

        }
        if (event.getSource() == button3) {
            String label = button3.getLabel();
            if (button2.getLabel().equals("")) {
                button2.setLabel(label);
                button3.setLabel("");

            }
            if (button6.getLabel().equals("")) {
                button6.setLabel(label);
                button5.setLabel("");
            }
        }
        if (event.getSource() == button4) {
            String label = button4.getLabel();
            if (button1.getLabel().equals("")) {
                button1.setLabel("");
                button4.setLabel("");

            }
            if (button5.getLabel().equals("")) {
                button5.setLabel("");
                button4.setLabel("");

            }


        }

        if (event.getSource() == button5) {
            String label = button5.getLabel();
            if (button2.getLabel().equals("")) {
                button2.setLabel("");
                button2.setLabel("");

            }
            if (button6.getLabel().equals("")) {
                button6.setLabel("");
                button5.setLabel("");

            }
            if (button4.getLabel().equals("")) {
                button4.setLabel("");
                button5.setLabel("");

            }
            if (button8.getLabel().equals("")) {
                button8.setLabel("");
                button5.setLabel("");

            }
        }
        if (event.getSource() == button6) {
            String label = button5.getLabel();
            if (button9.getLabel().equals("")) {
                button9.setLabel("");
                button6.setLabel("");

            }
            if (button3.getLabel().equals("")) {
                button3.setLabel("");
                button6.setLabel("");

            }
            if (button5.getLabel().equals("")) {
                button5.setLabel("");
                button6.setLabel("");

            }
        }
        if (event.getSource() == button7) {
            String label = button7.getLabel();
            if (button4.getLabel().equals("")) {
                button4.setLabel("");
                button7.setLabel("");

            }
            if (button8.getLabel().equals("")) {
                button8.setLabel("");
                button7.setLabel("");

            }
        }
        if (event.getSource() == button8) {
            String label = button8.getLabel();
            if (button9.getLabel().equals("")) {
                button9.setLabel("");
                button8.setLabel("");

            }
            if (button5.getLabel().equals("")) {
                button9.setLabel("");
                button8.setLabel("");

            }
        }
        if (event.getSource() == button9) {
            String label = button9.getLabel();
            if (button6.getLabel().equals("")) {
                button6.setLabel("");
                button9.setLabel("");

            }
            if (button8.getLabel().equals("")) {
                button8.setLabel("");
                button9.setLabel("");

            }
        }
        if (button1.getLabel().equals("1") && button2.getLabel().equals("2") && button3.getLabel().equals("3")
                && button4.getLabel().equals("4") && button5.getLabel().equals("5") && button6.getLabel().equals("6")
                && button7.getLabel().equals("7") && button8.getLabel().equals("8") && button9.getLabel().equals("")){
        JOptionPane.showMessageDialog(this, "Congratulation. You've won");

    }}
    public static void main(String []a){
        new Puzzle();
    }

}

