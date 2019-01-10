package sample;

public class PassingParameterByValue {
    public static void main (String[] args){
        int a = 30;
        int b = 45;
        System.out.println("Before swapping a: " + a + "b: " + b);

        swapFunction(a,b);
        System.out.println("\n Now, Before and after swapping ");
        System.out.println("After swapping a: " + a + "B: " + b);
    }
    public static void swapFunction(int a, int b){
        System.out.println("Before swapping (inside), a= " + a+ "b: " + b);
        int c = a;
        a = b;
        b=c;
        System.out.println("After swapping (Inside), a= )" + a + "b: " + b);
    }

}
