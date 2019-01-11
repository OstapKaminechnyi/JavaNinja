package javaswing;

import javax.swing.*;
import java.awt.*;

public class TitleBar {
    TitleBar() {
        JFrame frame = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage(
                "D:\\Repo\\JavaNinja\\workspace\\JavaSwing\\src\\javaswing\\220px-Kotlin-logo.svg.png");
        frame.setIconImage(icon);
        frame.setLayout(null);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
    public static void main(String[] a){
        new TitleBar();
    }
}
