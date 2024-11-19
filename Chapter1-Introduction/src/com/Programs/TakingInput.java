package com.Programs;

import java.util.Scanner;
// After giving an integer input the string doesn't take the
// string input you need to give the integer in the format of
// string later convert the string into int using
// Integer parseInt(Given string input)
public class TakingInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println(name);
    }
}
