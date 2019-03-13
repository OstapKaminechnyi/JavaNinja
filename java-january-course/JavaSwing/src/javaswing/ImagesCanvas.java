package javaswing;

import javax.swing.*;
import java.awt.*;

public class ImagesCanvas extends Canvas {
    public void paint (Graphics graphics){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("D:\\Repo\\JavaNinja\\workspace\\JavaSwing\\src\\javaswing\\246x0w.jpg");
        graphics.drawImage(image,120,120,this);
    }
    public static void main(String[] a){
        ImagesCanvas imagesCanvas = new ImagesCanvas();
        JFrame frame = new JFrame();
        frame.add(imagesCanvas);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
