package thread;

public class Multithreading implements Runnable {
    public void run(){
        System.out.println("running");
    }
    public static void main(String args[]){
        Multithreading obj = new Multithreading();
        Thread obj1 = new Thread(obj);
        obj1.start( );
    }
}
