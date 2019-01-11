package javaswing;

import javax.swing.*;
import java.awt.*;

public class JDesktopPane1 extends JFrame {
     public JDesktopPane1(){
         CustomDesktopPane desktopPane = new CustomDesktopPane();
         Container contentPane = getContentPane();
         contentPane.add(desktopPane,BorderLayout.CENTER);
         desktopPane.display(desktopPane);
         setTitle("Jdesktop");
         setSize(300,250);
         setVisible(true);

     }
     public static void main(String[] a){
         new JDesktopPane1();
     }
}
