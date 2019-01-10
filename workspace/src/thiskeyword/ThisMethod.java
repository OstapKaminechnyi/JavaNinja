package thiskeyword;

public class ThisMethod {
    public static void main(String args[]){
        ThisMethod obj = new ThisMethod();
        obj.methodTwo();
    }
    void methodOne(){
        System.out.println("Inside method One");
    }

    void methodTwo(){
        System.out.println("Inside method Two");
        this.methodOne();
    }
}
