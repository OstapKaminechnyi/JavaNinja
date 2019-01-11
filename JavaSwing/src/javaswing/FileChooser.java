package javaswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileChooser extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    JTextArea textArea;

    FileChooser() {
        menuItem = new JMenuItem("Open File");
        menuItem.addActionListener(this);
        menu = new JMenu("File");
        menu.add(menuItem);
        menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 800, 200);
        menuBar.add(menu);
        textArea = new JTextArea(800, 800);
        textArea.setBounds(0, 20, 800, 800);
        add(menuBar);
        add(textArea);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuItem) {
            JFileChooser fileChooser = new JFileChooser();
            int i = fileChooser.showOpenDialog(this);
            if (i == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                String filePath = file.getPath();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
                    String s1 = "", s2 = "";
                    while ((s1 = bufferedReader.readLine()) != null) {
                        s2 += s1 + "\n";
                    }
                    textArea.setText(s2);
                    bufferedReader.close();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }


            }
        }

    }

    public static void main(String[] a) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setSize(500, 500);
        fileChooser.setLayout(null);
        fileChooser.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
