package inheritance2;

public class CompTeacher extends Teacher {
    String mainSubject = "Computer Science";
    public static void main (String[] args){
        CompTeacher obj = new CompTeacher();
        System.out.println(obj.collegeName
        );
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
}
