package com.Patterns;

import java.util.Scanner;

// spaces increasing and stars decreasing
// *   *   *   *   *
//     *   *   *   *
//         *   *   *
//             *   *
//                 *
// If stars are decreasing than assign st = n.
// If spaces are decreasing than assign sp = n - 1.
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();
        int sp = 1;
        int st = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp++;
            st--;
            System.out.println();
        }
    }
}
