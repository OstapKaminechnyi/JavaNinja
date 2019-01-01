package sample;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Exception {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D://file.txt");
        FileReader fr = new FileReader(file);
    }
}
