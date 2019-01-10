package hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class hashTable1 {
    public static void main(String a[]){
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Ostap", 32561.09);
        balance.put("Kaminechnyi", 12020.22);
        balance.put("daisy", 2001.1010);
        balance.put("Flower", -201010.111111);
        names = balance.keys();
        while (names.hasMoreElements()){
            str = (String) names.nextElement();
            System.out.println(str+ ":" + balance.get(str));
        }
        System.out.println();


    bal = (Double) balance.get("Ostap");
    balance.put("Ostap", (double) (bal + 1000));
    System.out.println("Ostap new balance : "+  balance.get("Ostap"));
}}
