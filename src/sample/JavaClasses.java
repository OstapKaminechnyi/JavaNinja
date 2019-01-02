package sample;

public class JavaClasses {
    private String name;

    public void setName(String n) {
        name = n;
    }
    public String getName(){
        return name;
    }
    public static void main (String args[]){

        JavaClasses javaClasses = new JavaClasses();
        javaClasses.setName("Visitor");
        System.out.println("Hello " + javaClasses.getName());
    }
}
