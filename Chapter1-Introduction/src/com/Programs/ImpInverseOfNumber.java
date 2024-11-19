package com.Programs;

import java.util.Scanner;

public class ImpInverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Inverted number : ");
        int inv = 0;
        int originalPlace = 1;
        while (n != 0){
            int originalDigit = n % 10;
            int invertedDigit = originalPlace;
            int invertedPosition = originalDigit;

//            making change to inv using ip and id
            inv = inv + invertedDigit * (int)Math.pow(10, invertedPosition - 1);
            n = n / 10;
            originalPlace++;
        }
        System.out.print(inv);
    }
}
