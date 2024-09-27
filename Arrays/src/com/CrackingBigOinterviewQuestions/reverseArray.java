package com.CrackingBigOinterviewQuestions;

public class reverseArray {
    public static void main(String[] args) {
        int[] customArray = {1,2,3,4,5};
        System.out.println("original array");
        printArray(customArray);

        reverseArray(customArray);

        System.out.println("reversed Array");
        printArray(customArray);
    }

    //    creating a method to reverse the array
    public static void reverseArray(int[] array){
        int start = 0;
        int end = array.length -1;

        while (start < end){
//            now we have to swap the elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

//            now move the elements towards centre
            start++; end--;
        }
    }

    //    creating a method to print the array
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
