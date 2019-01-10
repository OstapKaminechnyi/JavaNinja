package linkedlist1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] a){
        List<LinkedListNOTKEYWORD> list = new LinkedList<LinkedListNOTKEYWORD>();
        LinkedListNOTKEYWORD l1 = new LinkedListNOTKEYWORD(200,"Java Head First", "Ostap",
                "ABC",10);
        LinkedListNOTKEYWORD l2 = new LinkedListNOTKEYWORD(200,"Java Head First java", "Matviy",
                "ABC",20);
        list.add(l1);
        list.add(l2);

        for (LinkedListNOTKEYWORD l:list){
            System.out.print(l.id+""+ l.name+""+ l.author+""+l.publisher+""+l.quantity);
        }
    }
}
