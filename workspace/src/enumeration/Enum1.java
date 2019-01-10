package enumeration;

public class Enum1 {
    public static void main(String args[]){
        EnumerationTester lang;
        System.out.println("here are list of constants: ");
        EnumerationTester allTypes[] = EnumerationTester.values();
        for (EnumerationTester a: allTypes){
            System.out.println(a);

            System.out.println();
            lang = EnumerationTester.valueOf("ASSEMBLY");
            System.out.println("values is " + lang);
        }
    }
}
