package com.Patterns;

// printing a multiplication table
// 2 * 1 = 2
// 2 * 2 = 4
// ..........
// 2 * 10 = 20

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for the multiplication table: ");
        int number = sc.nextInt();

        System.out.print("Enter the range up to which the table should be printed: ");
        int range = sc.nextInt();

        System.out.println("\nMultiplication Table for " + number + ":");
        System.out.println("----------------------------------");

        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        sc.close();
    }
}
