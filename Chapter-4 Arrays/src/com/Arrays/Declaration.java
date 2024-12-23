package com.Arrays;

public class Declaration {
    public static void main(String[] args) {
        int[] arr; // declaration of array
        arr = new int[5]; // size of the array
        arr[0] = 33;
        arr[1] = 47;
        arr[2] = 59;
        arr[3] = 87;
        arr[4] = 99;

        int[] two = arr;
        two[1] = 200;
        swap(arr,0,4);
//        looping all the elements in the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
//    creating a function two swap two numbers in the array
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
//        swapping occurs.
    }
}
