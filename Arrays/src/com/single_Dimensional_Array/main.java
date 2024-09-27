package com.single_Dimensional_Array;

public class main {
    public static void main(String[] args) {
        SingleDimensionalArrays sda = new SingleDimensionalArrays(7);
        sda.inserting(0,0);
        sda.inserting(1,1);
        sda.inserting(2,2);
        sda.inserting(3,3);
        sda.inserting(4,4);
        sda.inserting(5,5);
        sda.inserting(6,6);
        printArray(sda.arr);
        sda.search(4);
        sda.deleting(3);
        printArray(sda.arr);

    }

    //    creating a method for printing the array
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
