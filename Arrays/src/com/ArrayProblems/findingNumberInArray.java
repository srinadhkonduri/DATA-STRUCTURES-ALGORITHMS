package com.ArrayProblems;

public class findingNumberInArray {
    public static void main(String[] args) {
        findingNumberInArray fn = new findingNumberInArray();
        int[] array = {1,2,3,4,5,6};
        fn.linearSearch(array, 4);
    }
    //    creating a method to find the number in the given array
    public void linearSearch(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                System.out.println("array element found at " + i);
            } else {
                System.out.println("value not found");
            }
        }
    }
}
