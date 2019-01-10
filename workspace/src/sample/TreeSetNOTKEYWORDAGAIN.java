package sample;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetNOTKEYWORDAGAIN {
    public static void main(String[] a){
    TreeSet<String> al = new TreeSet<String>();
    al.add("Ostap");
    al.add("Kaminechnyi");
    al.add("Joe");
    al.add("Sarah");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
}}
