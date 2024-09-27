package com.TwoDimensionalArrays;

public class twoDimensionalArrays {
    //    1 . creating a null variable for tda
    int[][] arr = null;
//    2 . creating a constructor for the following array

    public twoDimensionalArrays(int rows, int col) {
        arr = new int[rows][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[rows][col] = Integer.MIN_VALUE;
            }
        }
    }

    //    3 . inserting elements in the array
    public void inserting(int row, int col, int valurToBeInserted){
        try {
            if (arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = valurToBeInserted;
                System.out.println("value inserted successfully");
            } else {
                System.out.println("already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("");
        }
    }

    //   traversal the array
//    tc = O(mn) sc = O(1)
    public void traversal(int row, int col){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    //    searching in the array
    public void search(int value){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == value){
                    System.out.println("element found at the index" + arr[i][j]);
                    return;
                }
            }
        }
    }

    //    deleting the element in the array
    public void deleting(int row, int col){
        try {
            System.out.println("array deleted successfully " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index for the array");
        }
    }
}
