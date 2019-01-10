package sample;
import java.util.Scanner;
public class IfElseStatement {
    public static void main(String[] args){
        int age;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter your age ");
        age = inputDevice.nextInt();
        if (age>=18){
            System.out.println("above 18");
        }
        else {
            System.out.println("Below 18");
        }
    }
}
