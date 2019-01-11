package javaswing;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

public class TextPane {
    public static void main(String a[]) throws BadLocationException {
        JFrame frame = new JFrame("JTextFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = frame.getContentPane();
        JTextPane pane = new JTextPane();
        SimpleAttributeSet att = new SimpleAttributeSet();
        StyleConstants.setBold(att, true);
        pane.setCharacterAttributes(att, true);
        pane.setText("WELCOME");
        att = new SimpleAttributeSet();
        StyleConstants.setItalic(att, true);
        StyleConstants.setForeground(att, Color.red);
        StyleConstants.setBackground(att, Color.blue);
        Document doc = pane.getStyledDocument();
        doc.insertString(doc.getLength(), "to java", att);
        att = new SimpleAttributeSet();
        doc.insertString(doc.getLength(), "World", att);
        JScrollPane scrollPane = new JScrollPane();
        cp.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
