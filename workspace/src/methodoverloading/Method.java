package methodoverloading;

public class Method {
    void display(){
        System.out.println("Method overloading");
    }

    void display(int x){
        System.out.println("Int");
    }

    void display(float x){
        System.out.println("Float");
    }

    void display(char x){
        System.out.println("Char");
    }

    void display(int x, int y){
        System.out.println("Integer and Integer \n" +x +", "+ y);
    }

    void display(int x,float y){
        System.out.println("Float, int: " + x + "," +y);
    }
    void display(float x, int y){
        System.out.println("Float, int");
    }
}
