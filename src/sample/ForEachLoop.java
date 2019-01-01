package sample;

public class ForEachLoop {
    public static void main(String[] args){
        int[] marks = {120,130,140,150,95,100};
        int highestMarks = maximum(marks);
        System.out.println("This highest score: " + highestMarks);
    }

public static int maximum(int[] numbers){
    int maxSoFar = numbers[0];
    for (int num : numbers){
        if (num>maxSoFar){
            maxSoFar=num;
        }
    }
    return maxSoFar;
}}