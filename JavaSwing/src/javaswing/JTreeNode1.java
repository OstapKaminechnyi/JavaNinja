package javaswing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;



public class JTreeNode1 extends JFrame{
    private JTree tree;
    public JTreeNode1(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        DefaultMutableTreeNode vegetableNode = new DefaultMutableTreeNode("Vegetable");
        DefaultMutableTreeNode fruitNode = new DefaultMutableTreeNode("Fruit");

        root.add(vegetableNode);
        root.add(fruitNode);

        tree = new JTree(root);
        add(tree);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("J Tree Node");
        this.pack();
        this.setVisible(true);


    }
    public static void main(String ar[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTreeNode1();
            }
        });
    }
}

