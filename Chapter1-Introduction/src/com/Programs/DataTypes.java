package com.Programs;

public class DataTypes {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int sum = a + b;
        System.out.println("sum of " + a + " and " + b + " is:" + sum);
        int prod = a*b;
        System.out.println("prod of " + a + " and " + b + " is:" + prod);
        int v1 = a / b;
        int v2 = b / a;
        int v3 = a % b;
        System.out.println(v1 + " " + v2 + " " + v3);

        int exp = (a * b) / (a + b);
        System.out.println(exp);
    }
}
