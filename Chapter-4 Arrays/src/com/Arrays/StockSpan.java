package com.Arrays;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of days
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();

        // Input the stock prices
        int[] prices = new int[n];
        System.out.println("Enter the stock prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Calculate the stock span
        int[] span = calculateStockSpan(prices);

        // Print the span for each day
        System.out.println("Stock Span for each day: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Day " + (i + 1) + ": " + span[i]);
        }
    }

    public static int[] calculateStockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); // Stack to store indices of days

        // Traverse through each day
        for (int i = 0; i < n; i++) {
            // Pop elements from the stack while the stack is not empty and the current
            // price is greater than the price at the stack's top index
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

            // Calculate the span
            if (stack.isEmpty()){
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            // Push the current day index onto the stack
            stack.push(i);
        }

        return span;
    }
}
