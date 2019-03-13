package javaswing;

import javax.swing.*;
import java.awt.*;

public class CustomDesktopPane extends JDesktopPane1 {
    int numFrames=3, x =30,y=30;
    public void display(CustomDesktopPane dp){
        for (int i = 0; i<numFrames;i++){
            JInternalFrame jframe = new JInternalFrame("Internal Frame" + i,true,true,true,true);
            jframe.setBounds(x,y,250,85);
            Container c1 = jframe.getContentPane();
            c1.add(new JLabel("I love my country"));
            dp.add(jframe);
            jframe.setVisible(true);
            y+=85;
        }
    }

}
