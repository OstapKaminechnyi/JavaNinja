package thiskeyword;

public class This1 {
    int variable=5;
    public static void main(String args[]){
        This1 obj = new This1();
        obj.method(2);
        obj.method();
    }

    void method(int variable){
        variable  = 10;
        System.out.println("Value of variable \n" + variable);
    }
    void method(){
        int variable= 40;
        System.out.println("Value of variable " + variable);
    }
}
