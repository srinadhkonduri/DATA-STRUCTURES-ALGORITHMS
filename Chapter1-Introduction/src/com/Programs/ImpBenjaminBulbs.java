package com.Programs;

import java.util.Scanner;

public class ImpBenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println("square of " + i + " is : " + i * i);
        }
    }
}
