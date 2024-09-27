package com.ArrayProblems;

public class maxProductOfTwoIntegers {
    public static void main(String[] args) {
        maxProductOfTwoIntegers mp = new maxProductOfTwoIntegers();
        int[] array = {10,20,30,40,50};
        String pair = mp.maxProduct(array);
        System.out.println(pair);
    }

    //    creating a method to find the max product of two integers
    public String maxProduct(int[] arr){
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] > maxProduct){
                    maxProduct = arr[i] * arr[j];
                    pairs = Integer.toString(arr[i]) + " , " +
                            Integer.toString(arr[j]);
                }
            }
        }
        return pairs;
    }
}
