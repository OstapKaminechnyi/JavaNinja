package sample;

public class ConstructorOverloading2 {
    private int rollNum;
    ConstructorOverloading2(){
        rollNum = 100;
    }
    ConstructorOverloading2(int rNum){
        this();
        rollNum = rollNum + rNum;
    }
    public  int getRollNum(){
        return rollNum;
    }
    private  void setRollNum(){
        this.rollNum = rollNum;
    }
    public static void main (String args[]){
        ConstructorOverloading2 obj = new ConstructorOverloading2(12);
        System.out.println(obj.getRollNum());
    }
}
