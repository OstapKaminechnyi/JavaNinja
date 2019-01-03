package superkeyword1;

public class Student extends Pers {
    void message(){
        System.out.println("This is Student Class");
    }
    void display(){
        message();
        super.message();
    }
}
