package com.Arrays;

import java.util.Scanner;
import java.util.Stack;

public class SlidingWindowMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for the array and the sliding window size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Populate the array
        }

        System.out.print("Enter the size of the sliding window: ");
        int k = sc.nextInt();

        // Step 2: Prepare to find the Next Greater Element (NGE) for each array element
        Stack<Integer> st = new Stack<>(); // Stack to store indices
        int[] nge = new int[arr.length];   // Array to store indices of the NGE

        // Step 3: Populate the NGE array by traversing the input array from right to left
        // NGE logic helps us to efficiently skip elements that can't be the maximum
        st.push(arr.length - 1); // Start with the last element in the array
        nge[arr.length - 1] = arr.length; // Last element's NGE is beyond the array

        // Traverse the array in reverse order
        for (int i = arr.length - 2; i >= 0; i--) {
            // While stack is not empty and the current element is greater than the element
            // at the index stored in the stack, pop the stack
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            // If the stack is empty, no greater element exists, otherwise use the top index
            nge[i] = st.size() == 0 ? arr.length : st.peek();

            // Push the current index onto the stack
            st.push(i);
        }

        // Step 4: Iterate through the array to calculate the maximum for each sliding window
        int j = 0; // Variable to track the starting index of the current window
        for (int i = 0; i <= arr.length - k; i++) {
            // Ensure `j` starts from the beginning of the current window
            if (j < i) {
                j = i;
            }

            // Use the NGE array to skip to indices that can potentially be the max
            while (nge[j] < i + k) {
                j = nge[j];
            }

            // Print the maximum value for the current window
            System.out.print(arr[j] + " ");
        }
    }
}
