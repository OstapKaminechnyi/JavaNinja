package sample;

import java.util.ArrayList;

public class ListInterface {
    public static void main(String[] a){
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ostap");
        al.add("Kaminechnyi");
        al.add("Udemy");
        al.add(2,"online");
        System.out.println("Element at 2nd position "+ al.get(2));
        for(String s:al){
            System.out.print(s);
        }
    }
}
