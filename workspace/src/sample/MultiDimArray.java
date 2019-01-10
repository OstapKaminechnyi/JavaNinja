package sample;

public class MultiDimArray {
    public static void main (String[] args){
        int[][] a = {
                {1,2,3},
                {4,5,6,8},
                {7},
        };
        System.out.println("length of row 1: " + a[0].length);
        System.out.println("length of row 2 " + a[1].length);
        System.out.println("length of row 3 " + a[2].length);
    }
}
