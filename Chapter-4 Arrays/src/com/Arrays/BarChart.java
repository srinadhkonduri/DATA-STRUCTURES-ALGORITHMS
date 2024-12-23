package com.Arrays;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        // Taking input from the user for the array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();  // Number of elements in the array
        int[] arr = new int[n];  // Array to hold the elements
        System.out.print("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // Storing user input in the array
        }

        // Finding the maximum element in the array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Updating max if a larger value is found
            }
        }

        // Printing the bar chart by calculating floors
        for (int floor = max; floor >= 1; floor--) {  // Loop from max down to 1
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= floor) {
                    System.out.print("*\t");  // Print '*' if the building is tall enough
                } else {
                    System.out.print("\t");  // Print space otherwise
                }
            }
            System.out.println();  // Move to the next line for the next floor
        }
    }
}
