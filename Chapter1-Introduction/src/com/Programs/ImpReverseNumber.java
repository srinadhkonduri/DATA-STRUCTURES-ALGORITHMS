package com.Programs;

import java.util.Scanner;

public class ImpReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long n = sc.nextInt();
        System.out.print("reversed number : ");
        while (n > 0){
            long dig = n % 10;
            n = n / 10;
            System.out.print(dig + " ");
        }
    }
}
