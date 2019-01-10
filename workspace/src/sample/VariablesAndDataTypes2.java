package sample;

public class VariablesAndDataTypes2 {
    static int count = 0;
    public void increment(){
        count++;
    }
    public static void main(String[] args){
        VariablesAndDataTypes2 obj1 = new VariablesAndDataTypes2();
        VariablesAndDataTypes2 obj2 = new VariablesAndDataTypes2();
        obj1.increment();
        obj2.increment();
        System.out.println("Obj1 : Count is = " + obj1.count);
        System.out.println("Obj2: Count is = " + obj2.count);
    }
}
