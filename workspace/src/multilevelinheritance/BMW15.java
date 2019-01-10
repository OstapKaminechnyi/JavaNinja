package multilevelinheritance;

public class BMW15 extends BMW {
    public BMW15(){
        System.out.println("BMW model : 2015");
    }
    public void speed(){
        System.out.println("Max: 180 km per h");
    }
    public static void main(String[] args){
        BMW15 obj = new BMW15();
        obj.vehicle();
        obj.brand();
        obj.speed();
    }
}
