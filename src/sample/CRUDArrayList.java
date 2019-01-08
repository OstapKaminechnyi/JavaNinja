package sample;

import java.util.ArrayList;
import java.util.List;

public class CRUDArrayList {
    public static void printList (List<String> words) {
        for (int i=0; i<words.size(); i++){
            System.out.println("Words["+ i+ "]"+words.get(i));
        }
    }
    public static void main(String[] a) {
        List<String> words = new ArrayList<String>();
        words.add("College");
        printList(words);
        words.add(0,"act");
        System.out.println("> insert via index");
        printList(words);
        words.set(1,"work");
        System.out.println("> update via index");
        printList(words);

        words.remove(0);
        System.out.println();
        printList(words);
    }
}
