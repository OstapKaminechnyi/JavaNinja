package sample;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        int age;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter age ");
        age = inputDevice.nextInt();
        switch (age) {
            case 18:
                System.out.println("Age 18");
                break;
            case 19:
                System.out.println("Age 19");
                break;
            case 20:
                System.out.println("Age 20");
                break;
            case 21:
                System.out.println("Age 21");
                break;
            default:
                System.out.println("Not matched ");
                break;
        }

    }

}
