package hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Test {
    public static void main(String a[]){
        Hashtable<Integer,String> ht = new Hashtable<Integer, String>();
        ht.put(120,"ostap");
        ht.put(200,"matviy");
        ht.put(120,"flower");
        System.out.println("__Hash Table__");
        for (Map.Entry m:ht.entrySet()){
            System.out.println(m.getKey()+"" + m.getKey());
        }
        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(100,"yustyna");
        hm.put(101,"yustyna");
        hm.put(102,"flower");
        System.out.println(" ________________hash map________________");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
