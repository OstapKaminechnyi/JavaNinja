package javaswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class WebBrowser {
    private JFrame frame;
    private JPanel panel;
    private JEditorPane editorPane;
    private JScrollPane scrollPane;
    private JTextField field;
    private JButton button;
    private URL url;
    public WebBrowser(String title){
        initComponent();
        frame.setTitle(title);
        frame.setSize(800,600);
        frame.add(BorderLayout.NORTH,panel);
        panel.add(field);
        frame.add(BorderLayout.CENTER,scrollPane);
        frame.setVisible(true);
    }
    private void initComponent(){
        frame = new JFrame();
        panel = new JPanel();
        try {
            url = new URL("https://www.youtube.com");

        }
        catch (MalformedURLException mue){
            JOptionPane.showMessageDialog(null,mue);
        }
        try{
            editorPane= new JEditorPane(url);
            editorPane.setEditable(false);
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null,e);
        }
        scrollPane = new JScrollPane(editorPane,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        field = new JTextField();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                field.setText(url.toString());
            }
        });
        button = new JButton("Go URL");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    editorPane.setPage(field.getText());
                }
                catch (IOException ex){
                    JOptionPane.showMessageDialog(null,ex);
                }
            }
        });

    }
    public static void main(String[] a){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WebBrowser("Simple Web Browser");
            }
        });
    }


}
