package com.recursion_level_1;

public class factorial {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }
    public static int fact(int n){
        if (n <= 1){
            return 1;
        }
        return n * fact(n - 1);
//        in place of star if replaced with + it calculates the sum
//        of the numbers
    }
}
