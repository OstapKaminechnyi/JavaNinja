package multithreading2;

public class ExtendingExample {
    public static void main(String args[]){
        Count cnt = new Count();
        try {
            while (cnt.isAlive()){
                System.out.println("alive");
                Thread.sleep(1500);
            }
        }
        catch (InterruptedException e){
            System.out.println("interrupted");
        }
        System.out.println("run over");
    }
}
