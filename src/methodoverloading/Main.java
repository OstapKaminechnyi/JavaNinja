package methodoverloading;

public class Main {
    public static void main(String args[]){
        Method obj = new Method();
        obj.display();
        obj.display(525);
        obj.display((float) 46.23 );
        obj.display('z');
        obj.display(45,63);
        obj.display(963, (float) 202.69);
        obj.display((float) 523.89, 20);
    }
}
