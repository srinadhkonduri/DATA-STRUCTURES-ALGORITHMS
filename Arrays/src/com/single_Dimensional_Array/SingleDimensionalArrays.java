package com.single_Dimensional_Array;

public class SingleDimensionalArrays {
    //    1 . initializing the array to a empty value null;
    int[] arr = null;
//    2 . creating a constructor for the array for inserting and
//    creating the array

    public SingleDimensionalArrays(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //    3 . inserting the elements in the array
    public void inserting(int location, int valueToBeInsertd){
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInsertd;
                System.out.println("inserted successfully");
            } else {
                System.out.println("already occupied in the array");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("");
        }
    }

    //    4 . accessing the elements in the array
    public void traversal(){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    //    5 . searching elements in the array
    public void search(int value){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == value){
                System.out.println("element found at the index of " + i);
            }
        }
    }

    //    6 . deleting the elements in the array
    public void deleting(int valueToBeDeleted){
        try {
            arr[valueToBeDeleted] = Integer.MIN_VALUE;
            System.out.println("array deleted successfully" + arr[valueToBeDeleted]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index for the array");
        }
    }
}
