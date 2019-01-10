package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {
    public static void main(String[] args){
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("myConfig.properties"));
            prop.list(System.out);
            System.out.println(prop.getProperty("File Name"));
            System.out.println(prop.getProperty("Author Name"));
            System.out.println(prop.getProperty("Topic"));
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
