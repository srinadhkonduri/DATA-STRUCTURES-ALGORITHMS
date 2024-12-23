package com.Arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.print("Enter the elements of the first array: ");
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }

        // Input for the second array
        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.print("Enter the elements of the second array: ");
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }

        // Creating the sum array
        int[] sum = new int[Math.max(n1, n2)];
        int c = 0; // Carry

        // Pointers for each array, starting at the end
        // pointers means refers the address of the current index and ele
        int i = n1 - 1;
        int j = n2 - 1;
        int k = sum.length - 1;

        // Loop to calculate the sum
        while (k >= 0) {
            int d = c; // Start with the carry

            // Add elements from the first array if available
            if (i >= 0) {
                d += a1[i];
            }

            // Add elements from the second array if available
            if (j >= 0) {
                d += a2[j];
            }

            // Calculate new carry and the current digit
            c = d / 10;
            sum[k] = d % 10;

            // Decrement pointers
            i--;
            j--;
            k--;
        }

        // If there's a carry left, print it
        if (c != 0) {
            System.out.print(c + " ");
        }

        // Print the final sum array
        for (int val : sum) {
            System.out.print(val + " ");
        }
    }
}
