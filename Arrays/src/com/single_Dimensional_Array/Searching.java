package com.single_Dimensional_Array;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        linearSearch(arr,4);
    }
    //    creating a method for searching the given value in the array
    public static void linearSearch(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                System.out.println("value found at index " + i);
                return;
            }
        }
        System.out.println(value + " not found in the array");
    }
}
