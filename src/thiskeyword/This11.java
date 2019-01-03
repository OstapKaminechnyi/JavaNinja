package thiskeyword;

public class This11 {
    This11(){
        this("This1");
        System.out.println("inside constructor without parameters");
}
    This11(String str){
        System.out.println("Inside constructor with String parameters as" + str);
    }
    public static void main(String args[]){
        This11 obj =   new This11();
    }
}
