package encapsulation;

public class EncapsTest {
    public static void main (String args[]){
        Encapsulation obj = new Encapsulation();
        obj.setEmpName("Ostap");
        obj.setEmpAge(19);
        obj.setSsn(122121);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee Age: " + obj.getEmpAge());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
    }
}
