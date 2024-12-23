package com.Arrays;
// Finding element in the array and out coming the index of the ele.
import java.util.Scanner;

public class FindingElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of ele for the array : ");
        int n = sc.nextInt();
//        Taking input for the array
        int[] arr = new int[n];
        System.out.print("enter the elements for the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target : ");
        int tar = sc.nextInt();
        int idx = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == tar) {
                idx = i;
                break;
            }
        }
        System.out.println("values is present at index : " + idx);
    }
}
