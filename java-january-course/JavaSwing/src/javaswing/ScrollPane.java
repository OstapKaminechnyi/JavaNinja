package javaswing;

import javax.swing.*;
import java.awt.*;

public class ScrollPane {

    private static final long serialVersionUID = 1L;
    private static void createAndShowGUI(){
        final JFrame frame = new JFrame("Scroll Pane");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());
        JTextArea textArea = new JTextArea(20,20);
        JScrollPane scrollableTextArea = new JScrollPane(textArea);
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        frame.getContentPane().add(scrollableTextArea);

    }
    public static void main(String ar[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
        });
    }
}
