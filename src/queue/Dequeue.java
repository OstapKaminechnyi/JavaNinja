package queue;

import java.util.ArrayList;
import java.util.List;

public class Dequeue {
    private List<Integer> dequeue = new ArrayList<Integer>();
    public void insertFront(int item){
    System.out.println("adding at front: " + item);
    dequeue.add(0,item);
    System.out.println(dequeue);
}
public void removeFront(){
        if (dequeue.isEmpty()){
            System.out.println("Dequeue is underfloor!! Unable to remove");
            return;
        }
        int rem=dequeue.remove(0);
        System.out.println("remove from front " + rem);
        System.out.println(dequeue);
}
public void removeRear(){
        if(dequeue.isEmpty()){
            System.out.println("Dequeue underfloor unable to remove ");
            return;
        }
        int rem=dequeue.remove(dequeue.size()-1);
        System.out.println("removed from front "+ rem);
        System.out.println(dequeue);

}
public int peakFront(){
        int item = dequeue.get(0);
        System.out.println("Element at first: " + item);
        return item;

}
public int peakRear(){
        int item = dequeue.get(dequeue.size()-1);
        System.out.println("Element at rear: " + item);
        return item;
}

public static void main(String args[]){
        Dequeue deq = new Dequeue();
        deq.insertFront(54);
        deq.insertFront(30);
        deq.removeFront();
        deq.removeFront();
        deq.removeFront();
        deq.insertFront(21);
        deq.insertFront(98);
        deq.insertFront(50);
        deq.insertFront(43);
        deq.removeFront();


}

}
