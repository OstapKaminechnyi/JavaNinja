package sample;
import java.util.*;
public class IfStatement {
    public static void main (String[] args){
        int age;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter Age ");
        age = inputDevice.nextInt();
        if(age>18){
            System.out.println("above 18");
        }
    }

}
