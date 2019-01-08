package Sorting;

public class QuickSort {
    private int array[];
    private int length;

    public void sort(int[] inputarr){
        if(inputarr==null || inputarr.length == 0){
            return;
        }
        this.array=inputarr;
        length = inputarr.length;
        quickSort(0,length-1);


    }
    private void quickSort(int lowerIndex, int higherIndex){
        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[lowerIndex + (higherIndex-lowerIndex)/2];

        while (i<=j){
            while(array[i]<pivot){
                i++;
            }
            while (array[i]>pivot){
                j--;
            }
            if(i<=j){
                exchangeNumbers(i,j);
                i++;
                j--;
            }
        }
        if(lowerIndex<j)
            quickSort(lowerIndex,j);
        if (i<higherIndex)
            quickSort(i,higherIndex);
    }
    private void exchangeNumbers(int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
    public static void main(String a[]){
        QuickSort sorter = new QuickSort();
        int[] input = {20,4,54354,5435,2312,53252,4344,44,1313,555};
        sorter.sort(input);
        for (int i:input){
        System.out.print(i);
        System.out.print(" ");
    }}
}
