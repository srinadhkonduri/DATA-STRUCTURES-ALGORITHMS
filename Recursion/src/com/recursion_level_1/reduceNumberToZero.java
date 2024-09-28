package com.recursion_level_1;

public class reduceNumberToZero {
    public static void main(String[] args) {
        int answer = numbers(123,0);
        System.out.println(answer);
    }
    public static int numbers(int num, int steps){
        if (num == 0){
            return steps;
        }
        if (num % 2 == 0){
            return numbers(num / 2 , steps + 1);
        }
        return numbers(num - 1 , steps + 1);
    }
}
