package singleinheritance;

public class B extends A {
    public void methodB(){
        System.out.println("Child class Method");
    }

    public static void main(String[] args){
        B obj = new B();
        obj.methodA();
        obj.methodB();
    }

}
