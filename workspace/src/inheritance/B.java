package inheritance;

public class B extends A {
    int bonus = 10000;
    public static void main(String[] args){
        B s = new B();
        System.out.println("Salary " + s.salary);
        System.out.println("Salary after bonus: " + s.bonus);
    }
}
