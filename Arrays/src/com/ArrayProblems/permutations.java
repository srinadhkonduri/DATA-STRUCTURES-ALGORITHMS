package com.ArrayProblems;
// given two arrays which containing equal values without bothering
// their index are called as permutations
// if two arrays are same they are called permutations
public class permutations {
    public static void main(String[] args) {
        permutations pt = new permutations();
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,4,3,2,1};
        boolean result = pt.permutation(array1,array2);
        System.out.println(result);
    }
    //    creating a method for array for permutations
    public boolean permutation(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }
        int sum1 = 0; int sum2 = 0; int mul1 = 1; int mul2 = 1;

        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
            mul1 *= arr1[i];
            mul2 *= arr2[i];
        }

        if (sum1 == sum2 && mul1 == mul2){
            return true;
        }
        return false;
    }
}
