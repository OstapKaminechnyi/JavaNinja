package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPFinder extends JFrame implements ActionListener {
    JLabel label;
    JTextField textField;
    JButton button;

    IPFinder(){
        super("IP finder in this section");
        label = new JLabel("Enter your Address/URL");
        label.setBounds(50,70,150,20);

        textField=new JTextField();
        textField.setBounds(50,100,200,20);

        button=new JButton("Find your IP address");
        button.setBounds(50,150,80,30);
        button.addActionListener(this);

        add(label);
        add(textField);
        add(button);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        String url = textField.getText();
        try {
            InetAddress inetAddress= InetAddress.getByName(url);
            String ip = inetAddress.getHostAddress();
            JOptionPane.showMessageDialog(this,ip);
        }
        catch (UnknownHostException e1){
            JOptionPane.showMessageDialog(this,e1.toString());
        }


    }
    public static void main(String a[]){
        new IPFinder();
    }
}
