package interface1;

public class TestInterface2 {
    public static void main(String[] args){
        Bank b = new ANZ();
        System.out.println(" ROI " + ((ANZ) b).rateOfInterest());
    }
}
