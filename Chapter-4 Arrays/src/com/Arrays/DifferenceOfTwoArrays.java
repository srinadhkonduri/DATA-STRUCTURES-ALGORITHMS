package com.Arrays;

import java.util.Scanner;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        taking input of array 1
        System.out.print("enter the size of subtracted ele : ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.print("Enter the ele : ");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

//        taking input of the array 2
        System.out.print("Enter the size of the number : ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.print("Enter the main number for subtracting the above num : ");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

//      creating a difference array initialize with bigger array.
        int[] diff = new int[n2];
        int carry = 0;

//        creating pointers to start the cal from last of the arr
        int i = a1.length -1;
        int j = a2.length -1;
        int k = diff.length -1;

//        creating and running a while loop till end of the array
        while (k >= 0){
            int d = 0;
            int a1v = i >= 0? a1[i]: 0;
            if (a2[j] + carry >= a1v){
                d = a2[j] + carry - a1v;
                carry = 0;
            } else {
                d = a2[j] + carry + 10 - a1v;
                carry = -1;
            }

            diff[k] = d;
            i--;
            j--;
            k--;
        }
//        creating and printing the condition if the array of the index
//        starts form the zero(should not print the first zeros)
        int idx = 0;
//        statement to ignore the first non zeroes
        while (idx < diff.length){
            if (diff[idx] == 0){
                idx++;
            } else {
                break;
            }
        }

//        printing the number of the result after zeroes
        while (idx < diff.length){
            System.out.print("Subtracted Value : " +diff[idx] + " ");
            idx++;
        }
    }
}
