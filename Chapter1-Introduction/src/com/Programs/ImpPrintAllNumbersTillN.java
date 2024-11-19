package com.Programs;

import java.util.Scanner;

public class ImpPrintAllNumbersTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number : ");
        int low = sc.nextInt();
        System.out.print("Enter the ending number : ");
        int high = sc.nextInt();
        System.out.print("Prime numbers till given input : ");
        for (int n = low; n <= high; n++) {
            int count = 0;
//            try to divide n and increase count
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0){
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.print(n + " ");
            }
        }
    }
}
