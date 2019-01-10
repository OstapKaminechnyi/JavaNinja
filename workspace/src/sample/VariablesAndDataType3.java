package sample;

public class VariablesAndDataType3 {
    String myInstanceVar = "instance Variable";
    public static void main(String [] args){
        VariablesAndDataType3 obj = new VariablesAndDataType3();
        VariablesAndDataType3 obj2 = new VariablesAndDataType3();
        VariablesAndDataType3 obj3 = new VariablesAndDataType3();
        System.out.println(obj.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);

        obj2.myInstanceVar = "Changed Text";
        System.out.println(obj.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);
    }
}
