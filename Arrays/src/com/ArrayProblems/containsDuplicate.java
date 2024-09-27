package com.ArrayProblems;

public class containsDuplicate {
    public static void main(String[] args) {
        containsDuplicate cd = new containsDuplicate();
        int[] array = {1,2,3,4,5,6,7};
        boolean result = cd.isUnique(array);
        System.out.println(result);
    }
    //    creating a method which contains duplicate elements in it
    public boolean isUnique(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}

