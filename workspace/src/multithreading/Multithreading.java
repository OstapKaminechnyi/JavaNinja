package multithreading;

public class Multithreading extends Thread {
    public void run(){
        System.out.println("running");
    }
    public static void main (String args[]){
        Multithreading obj  = new Multithreading();
        obj.start();
    }
}
