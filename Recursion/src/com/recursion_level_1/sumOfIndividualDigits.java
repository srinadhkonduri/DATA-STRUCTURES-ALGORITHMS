package com.recursion_level_1;

public class sumOfIndividualDigits {
    public static void main(String[] args) {
        int answer = sum(543);
        System.out.println(answer);
    }
    public static int sum(int n){
        if (n == 0){
            return 0;
        }
        return (n % 10) + sum(n % 10);
//        in place of + you replaced with * it will give the product
//        of the individual digits

    }
}
