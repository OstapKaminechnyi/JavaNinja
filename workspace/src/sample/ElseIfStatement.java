package sample;

import java.util.Scanner;

public class ElseIfStatement {
    public static void main(String[] args) {
        int age;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("please enter age ");
        age = inputDevice.nextInt();
        if (age >= 18 && age <= 38) {
            System.out.println("Between 18-38");


        } else if (age>38 && age <= 60){
            System.out.println("Between 38 and 60");
        }
        else {
            System.out.println("Not Matched");
        }
    }
}
