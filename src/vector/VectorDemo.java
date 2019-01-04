package vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args){
        Vector v = new Vector(3,2);
        System.out.println("Initial size " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        v.addElement(5);
        System.out.println("Capacity after five additions " + v.capacity());
        v.addElement(0.45);
        System.out.println("Current Capacity " + v.capacity());
        v.addElement(5.04);
        v.addElement(7);
        System.out.println("Current Capacity" + v.capacity());
        v.addElement(9.2);
        v.addElement(10);
        System.out.println("Current Capacity" + v.capacity());
        v.addElement(11);
        v.addElement(12);
        System.out.println("First element " + v.firstElement());
        System.out.println("Last element " + v.lastElement());
        if(v.contains(3) ){
            System.out.println("vector contains 3");

            Enumeration vEnum = v.elements();
            System.out.println("\n Element is Vector");

            while (vEnum.hasMoreElements()){
                System.out.println(vEnum.nextElement()+"");
                System.out.println();
            }
        }
    }


}
