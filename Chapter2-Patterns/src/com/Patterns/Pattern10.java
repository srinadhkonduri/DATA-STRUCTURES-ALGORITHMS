package com.Patterns;

import java.util.Scanner;

// Hallow Diamond
//          *
//      *       *
//  *               *
//      *       *
//          *
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        int os = n / 2;
        int is = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 1; j <= is; j++) {
                System.out.print("\t");
            }
//            base condition for printing the first and last row of the star
            if (i > 1 && i < n){
                System.out.print("*\t");
            }
            if (i <= n / 2){
                os--;
                is += 2;
            } else {
                os++;
                is -= 2;
            }
            System.out.println();
        }
    }
}
