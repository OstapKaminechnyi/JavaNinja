package polymorphism;

public class Test {
    public static void main(String[] args){
        StaticPolymorphism static1 = new StaticPolymorphism();
        System.out.println(static1.add(2,3));
        System.out.println(static1.add(2,3,5));
        System.out.println(static1.add(2,3.4));
        System.out.println(static1.add(2.6,3));



    }
}
