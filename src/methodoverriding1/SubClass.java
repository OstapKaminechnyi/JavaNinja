package methodoverriding1;


public class SubClass extends Method {
    void display(){
        super.display();
        System.out.println("Class: sub class");
    }
}
