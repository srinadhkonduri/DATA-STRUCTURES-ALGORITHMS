package com.recursion_level_1;

public class binarySearchWithRecursion {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int target = 4;
        System.out.println(search(array,target,0,array.length-1));
    }
//    creating a method for binary search using recursion
    public static int search(int[] array, int target, int start, int end){
        if (start > end){
            return - 1; // element is not found
        }
        int m = start + (end - start) / 2;
        if (array[m] == target){
            return m;
        }
        if (target < array[m]){
            return search(array,target,start,m-1);
        }
        return search(array,target,m + 1,end);
    }
}
