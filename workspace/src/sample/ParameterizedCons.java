package sample;

public class ParameterizedCons {
    ParameterizedCons(){
        System.out.println("Default constructor ");
    }
    ParameterizedCons(int i, int j){
        System.out.println("Constructor with two parameters");
    }

    ParameterizedCons(int i, int j, int k){
        System.out.println("Constructor with 3 parameters");
    }
    ParameterizedCons(int i, String name){
        System.out.println("Constructor with int and String parameters");

    }
    public static void main(String[] args){
        ParameterizedCons obj = new ParameterizedCons();
        ParameterizedCons obj2 = new ParameterizedCons(12,12);
        ParameterizedCons obj3 = new ParameterizedCons(13,14,15);
        ParameterizedCons obj4 = new ParameterizedCons(1,"Java");
    }
}
