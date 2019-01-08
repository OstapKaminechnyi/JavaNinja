package sample;

public class ConstructorOverloading {
    int id;
    String name;
    int age;

    ConstructorOverloading(int i, String n){
        id = i;
        name = n;
    }
    ConstructorOverloading(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }
    void display(){
        System.out.println(id + "" + name + "" + age);

    }
    public static void main(String args[]){
        ConstructorOverloading obj1 = new ConstructorOverloading(11,"Ostap");
        ConstructorOverloading obj2 = new ConstructorOverloading(12, "Kaminechnyi",12);
        obj1.display();
        obj2.display();
    }
}
