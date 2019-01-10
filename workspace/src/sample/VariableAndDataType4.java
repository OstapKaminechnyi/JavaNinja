package sample;

public class VariableAndDataType4 {
    public String myVariable = "Instance Variable";
    public void myMethod(){
        String myVariable = "Inside Method";
        System.out.println(myVariable);
    }
    public static void main (String args[]){
        VariableAndDataType4 obj = new VariableAndDataType4();
        System.out.println("Calling Method");
        obj.myMethod();
        System.out.println(obj.myVariable);
    }
}
