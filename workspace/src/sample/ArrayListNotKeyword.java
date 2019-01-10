package sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListNotKeyword {
    public static void main(String[] args){
        ArrayList <String> list = new ArrayList<>();
        list.add("Ostap");
        list.add("Matviy");
        list.add("Yustyna");
        list.add("Ostap");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }


    }
}
