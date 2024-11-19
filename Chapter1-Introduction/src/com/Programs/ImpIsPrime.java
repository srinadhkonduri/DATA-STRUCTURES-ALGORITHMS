package com.Programs;

import java.util.Scanner;

public class ImpIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        optimized code for checking a number is prime or not
        int test = sc.nextInt(); // giving how many numbers you want (Ex : 5 Numbers or as your wish)
        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();// inputting given numbers

            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0){ // Checking the prime number condition 7 / 1 = 7 (remainder = 0)
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println("the given number : " + n + " prime");
            } else {
                System.out.println("the given number : " + n + " not prime");
            }
        }
    }
}

//      old code which is not optimized

//      for (int i = 0; i < test; i++) {
//      int n = sc.nextInt();// inputting given numbers
//
//      int count = 0;
//      for (int div = 1; div <= n; div++) {
//          if (n % div == 0){ // Checking the prime number condition 7 / 1 = 7 (remainder = 0)
//              count++;
//          }
//      }
//      if (count == 2){
//          System.out.println("the given number : " + n + " prime");
//      } else {
//          System.out.println("the given number : " + n + " not prime");
//      }
//      }
