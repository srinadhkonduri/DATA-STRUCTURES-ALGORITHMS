package com.Arrays;

import java.util.Scanner;
import java.util.Stack;

public class MaxAreaHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the ele in the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        finding the right boundary of array(nse index on right)
        int[] rb = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        rb[arr.length-1] = arr.length;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] < arr[st.peek()]) {
                st.pop();
            }
                if (st.size() == 0){
                    rb[i] = arr.length;
                } else {
                    rb[i] = st.peek();
                }
                st.push(i);
        }
//        finding the left boundary of array(nse index on left)
        int[] lb = new int[arr.length];
        st = new Stack<>();
        st.push(0);
        lb[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] < arr[st.peek()]){
                st.pop();
            }
            if (st.size() == 0){
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }
            st.push(i);
        }

//        finding the max area of the array containing the whole area.
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = arr[i] * width;
            if (area > maxArea){
                maxArea = area;
            }
        }
        System.out.println(maxArea);
    }
}
