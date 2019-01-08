package Sorting;

public class InsertionSort {
    public static void main(String args[]){
        int[] array1 = {10,12,33,42,11,3314,433,1};
        int[] array2 = doInsertionSort(array1);
        for (int i:array2){
            System.out.print(i);
            System.out.print(",");
        }
    }
    public static int[] doInsertionSort(int[] input){
        int temp;
        for(int i=1;i<input.length;i++){
            for (int j=i;j>0;j--){
                if(input[j]<input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1]=temp;

                }
            }
        }
        return input;
    }

}
