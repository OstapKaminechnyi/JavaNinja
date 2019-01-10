package interface_not_keyword;

public class A implements Printable {
    public void print(){
        System.out.println("hello");
    }
    public static void main (String args[]){
        A obj = new A();
        obj.print();
    }
}
