package com.Arrays;

import java.util.Scanner;

// Finding the largest ele in the array and smallest ele in the
// arr and minus max-min = difference.
public class SpanOfArray {
    public static void main(String[] args) {

//        TAKING INPUT FROM THE ARRAY.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
//        Declaration of array
        int[] arr = new int[n];
//        Entering elements in the array using for loop.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        FINDING DIFFERENCE BETWEEN ELEMENTS IN THE ARRAY.
//        creating two variables which holds max and min
//        while we are finding max and min declaration should also should be in arr.
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("max is : " + max);
        System.out.println("min is : " + min);
        int span = max - min;
        System.out.println("difference between max and min : " + span);
    }
}
