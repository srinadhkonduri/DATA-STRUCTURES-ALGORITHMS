package com.CrackingBigOinterviewQuestions;

public class sumAndProduct {
    public static void main(String[] args) {
        sumAndProduct main = new sumAndProduct();
        int[] customArray = {1,2,3,4};
        main.exampleArray(customArray);
    }
    //    creating a method to print sum and product for the given number
    public static void exampleArray(int[] array){
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            prod *= array[i];
        }
        System.out.println(sum + "," + prod);
    }
}
