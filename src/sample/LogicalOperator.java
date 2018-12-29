package sample;

public class LogicalOperator {
    public static void main (String args[]){
        boolean b1 = true;
        boolean b2 = false;
        System.out.print("b1 && b2" + (b1&&b2));
        System.out.print("b1 || b2" + (b1||b2));
        System.out.print("!(b1 && b2):" + !(b1&&b2));

    }
}
