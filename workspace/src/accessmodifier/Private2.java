package accessmodifier;

public class Private2{
    public static void main(String args[]){
        Private1 obj = new Private1();
        System.out.println(obj.a);
        obj.show();
    }
}
