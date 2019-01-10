package javaswing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeNode2 {
    JFrame f;
    JTreeNode2(){
        f = new JFrame();
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");
        style.add(color);
        style.add(font);

        DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("black");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
        color.add(red);
        color.add(blue);
        color.add(black);
        color.add(green);
        JTree jt = new JTree(style);
        f.add(jt);
        f.setSize(400,400);
        f.setVisible(true);


    }
    public static void main(String[] a){
        new JTreeNode2();

    }
}
