package com.Patterns;

import java.util.Scanner;
// spaces decreasing and stars increasing
//                  *
//              *   *
//          *   *   *
//      *   *   *   *
//  *   *   *   *   *

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        int sp = n - 1;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
}
