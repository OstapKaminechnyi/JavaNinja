package sample;

public class ParameterizedCons2{
    ParameterizedCons2(int i, int j){
        System.out.println("Parameterized cons");
    }
    ParameterizedCons2(int i, int j, int k){
        System.out.println("parameterized cons 2");
    }
    public static void main(String args[]){
        ParameterizedCons2 obj = new ParameterizedCons2(12,18,19);
    }
}
