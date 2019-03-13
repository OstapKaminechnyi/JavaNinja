package javaswing;

import javax.swing.*;

public class EditorPane {
    JFrame myFrame = null;
    public static void main(String[] a){
        (new EditorPane()).test();

    }
    private void test(){
        myFrame=new JFrame("JEditorPane");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400,200);
        JEditorPane myPane = new JEditorPane();
        myPane.setContentType("Text/plain");
        myPane.setText("The quick brown fox jumps over the lazy dog"+"lorem v  myFrame=new JFrame(\"JEditorPane\");\n" +
                "        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n" +
                "        myFrame.setSize(400,200);\n" +
                "        JEditorPane myPane = new JEditorPane();\n" +
                "        myPane.setContentType(\"Text/plain\");");
        myFrame.setContentPane(myPane);
        myFrame.setVisible(true);
    }
}
