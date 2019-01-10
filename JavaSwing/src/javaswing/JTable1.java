package javaswing;

import javax.swing.*;

public class JTable1 {
    JFrame f;
    JTable1(){
        f = new JFrame();
        String data[][] = {{"1012","Ostap","68000"}, {"1013", "Kaminechnyi", "80000"},{"5013","Joy","102012"}};
        String column[] = {"ID","Name","Salary"};
        JTable jt = new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }
    public static void main(String[] a){
        new JTable1();
    }

}
