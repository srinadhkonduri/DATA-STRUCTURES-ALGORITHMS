package com.Arrays;


import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input the elements of the array
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function to find the next greater elements
        int[] nextGreater = findNextGreaterElements(arr);

        // Print the results
        System.out.println("Next Greater Elements: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Element: " + arr[i] + " -> Next Greater: " + nextGreater[i]);
        }
    }

    public static int[] findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n]; // Array to store the next greater elements
        Stack<Integer> stack = new Stack<>(); // Stack to keep track of indices

        // Traverse the array from right to left
//       * if we want to traverse the loop from left to right just
//        reverse the condition
        for (int i = n - 1; i >= 0; i--) {
            // Remove elements from the stack that are smaller than or equal to the current element
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
//                if we want to find the next smallest ele than reverse the condition
//                to <= to >= .
                stack.pop();
            }

            // If the stack is empty, there is no greater element for the current element
//            result[i] = stack.isEmpty() ? -1 : arr[stack.peek()];
            if (stack.isEmpty()){
                result[i] = -1;
            } else {
                result[i] = arr[stack.peek()];
            }

            // Push the current index onto the stack
            stack.push(i);
        }

        return result;
    }
}

