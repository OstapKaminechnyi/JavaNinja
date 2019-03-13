package javaswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JToggleButton1 extends JFrame implements ItemListener {
    public static void main(String a[]){
        new JToggleButton1();
    }
    private JToggleButton button;
    JToggleButton1(){
        setTitle("JToggle Button");
        setLayout(new FlowLayout());
        setJToggleButton();
        setAction();
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    private void setJToggleButton(){
        button = new JToggleButton("On");
        add(button);
    }
    private void setAction(){
        button.addItemListener(this);

    }
    public void itemStateChanged(ItemEvent eve){
        if(button.isSelected()){
            button.setText("Off");
        }
        else {
            button.setText("On");
        }

    }
}
